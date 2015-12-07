package dziedziczenie;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RodzinaTest {

	Chlopiec mikolajek;
	Dziewczynka magma;
	Mezczyzna maurycy;
	Kobieta kunegunda;
	Rodzina nowaRodzina;

	@Test
	public void dodajDzieckoTest() {
		Assert.assertFalse("Nie powinno sie dac dodac drugi raz tego samego dziecka", nowaRodzina.dodajDziecko(magma));
	}

	@Test
	public void iloscChlopcowTest() throws DataUrodzinException {
		Assert.assertEquals(1, nowaRodzina.iloscChlopcow());
		Chlopiec kazik = new Chlopiec("kazik");
		kazik.setDataUrodzenia(Calendar.getInstance());

		nowaRodzina.dodajDziecko(kazik);
		Assert.assertEquals(2, nowaRodzina.iloscChlopcow());
	}

	/**
	 * Metoda testowa musi by� oznaczona adnotacj� @Test Testy uruchamia si� Run->Run as->JUnit Test
	 */
	@Test
	public void wiekRodzinyTest() {
		Assert.assertEquals(98, nowaRodzina.getWiekRodziny());
	}

	@Test
	public void iloscDziewczynekTest() {
		Assert.assertEquals(1, nowaRodzina.iloscDziewczynek());
		Assert.assertEquals(1, nowaRodzina.iloscDziewczynek());
	}

	@Test
	public void przyszlaDataTest() {
		Calendar magmusiUr = Calendar.getInstance();
		magmusiUr.set(2225, 0, 11);
		Calendar poprzedniaDataMagmy = magma.getDataUrodzenia();
		try {
			magma.setDataUrodzenia(magmusiUr);
			Assert.fail(" blad nie zostal rzucony, nie jest ok");
			System.out.println("to nie zostanie wypisane");
		} catch (DataUrodzinException ex) {
			System.out.println("jest ok");
			Assert.assertEquals(poprzedniaDataMagmy, magma.getDataUrodzenia());
		}
	}

	@Test
	public void data1990Test() {
		Calendar ktosBardzoStary = Calendar.getInstance();
		ktosBardzoStary.set(1888, 12, 12);
		try {
			mikolajek.setDataUrodzenia(ktosBardzoStary);
			Assert.fail("przeszło a nie powinno");
		} catch (DataUrodzinException ex) {
			System.out.println("wyjątek złapany");
		}
	}

	@Test
	/**
	 * Metoda oznaczona adnotacj� @Before zostanie uruchomiona przed metod� testow�. S�u�y ona przygotowaniu danych
	 * testowych.
	 * 
	 * @throws DataUrodzinException
	 */
	@Before
	public void init() throws DataUrodzinException {
		mikolajek = new Chlopiec("mikolaj");
		magma = new Dziewczynka("pulpecik");
		maurycy = new Mezczyzna("frajer");
		kunegunda = new Kobieta("lachon");
		Calendar urodzinyMikolajka = Calendar.getInstance();
		urodzinyMikolajka.set(1990, 10, 28);
		Calendar urodzinyMagmy = Calendar.getInstance();
		urodzinyMagmy.set(2007, 1, 14);
		Calendar urodzinyMaurycego = Calendar.getInstance();
		urodzinyMaurycego.set(1974, 11, 15);
		Calendar urodzinyKundegundy = Calendar.getInstance();
		urodzinyKundegundy.set(1986, 7, 22);
		magma.setDataUrodzenia(urodzinyMagmy);
		maurycy.setDataUrodzenia(urodzinyMaurycego);
		kunegunda.setDataUrodzenia(urodzinyKundegundy);
		mikolajek.setDataUrodzenia(urodzinyMikolajka);
		magma.dodajZainteresowanie("jedzenie");
		magma.dodajZainteresowanie("spanie");
		maurycy.dodajZainteresowanie("podryw");
		kunegunda.dodajZainteresowanie("mobbing");
		mikolajek.setKieszonkowe(15);
		magma.setKieszonkowe(25);

		nowaRodzina = new Rodzina();
		nowaRodzina.setMama(kunegunda);
		nowaRodzina.setTata(maurycy);
		nowaRodzina.dodajDziecko(magma);
		nowaRodzina.dodajDziecko(mikolajek);

	}

	@Test
	public void ileKieszonkowegoTest() {
		Assert.assertEquals(15, mikolajek.getKieszonkowe());
		Assert.assertEquals(25, magma.getKieszonkowe());
	}

	@Test
	public void sprawdzImieTest() {
		Assert.assertEquals("frajer", maurycy.getImie());
		Assert.assertEquals(Dziecko.DOMYSLNE_IMIE_DZIECKA, new Chlopiec().getImie());
		Assert.assertEquals(Dziecko.DOMYSLNE_IMIE_DZIECKA, new Dziewczynka().getImie());

	}

	@Test
	public void najstarszeDzieckoTest() {
		Assert.assertEquals(mikolajek, nowaRodzina.najstarszeDziecko());
	}

	@Test
	public void najmłodszeDzieckoTest() {
		Assert.assertEquals(magma, nowaRodzina.najmlodszeDziecko());
	}
}
