package dziedziczenie;

import java.util.Date;

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
	public void iloscChlopcowTest() {
		Assert.assertEquals(1, nowaRodzina.iloscChlopcow());
		Chlopiec kazik = new Chlopiec("kazik");
		kazik.setDataUrodzenia(new Date());

		nowaRodzina.dodajDziecko(kazik);
		Assert.assertEquals(2, nowaRodzina.iloscChlopcow());
	}

	/**
	 * Metoda testowa musi by� oznaczona adnotacj� @Test Testy uruchamia si� Run->Run as->JUnit Test
	 */
	@Test
	public void iloscDziewczynekTest() {
		Assert.assertEquals(1, nowaRodzina.iloscDziewczynek());
		Assert.assertEquals(1, nowaRodzina.iloscDziewczynek());
	}

	/**
	 * Metoda oznaczona adnotacj� @Before zostanie uruchomiona przed metod� testow�. S�u�y ona przygotowaniu danych
	 * testowych.
	 */
	@Before
	public void init() {
		mikolajek = new Chlopiec("mikolaj");
		magma = new Dziewczynka("pulpecik");
		maurycy = new Mezczyzna("frajer");
		kunegunda = new Kobieta("lachon");
		Date urodzinyMikolajka = new Date(90, 11, 15);
		Date urodzinyMagmy = new Date(2007 - 1900, 2, 15);
		Date urodzinyMaurycego = new Date(55, 11, 16);
		Date urodzinyKundegundy = new Date(90, 10, 28);
		magma.setDataUrodzenia(urodzinyMagmy);
		maurycy.setDataUrodzenia(urodzinyMaurycego);
		kunegunda.setDataUrodzenia(urodzinyKundegundy);
		mikolajek.setDataUrodzenia(urodzinyMikolajka);
		magma.dodajZainteresowanie("jedzenie");
		magma.dodajZainteresowanie("spanie");
		maurycy.dodajZainteresowanie("podryw");
		kunegunda.dodajZainteresowanie("mobbing");

		nowaRodzina = new Rodzina();
		nowaRodzina.setMama(kunegunda);
		nowaRodzina.setTata(maurycy);
		nowaRodzina.dodajDziecko(magma);
		nowaRodzina.dodajDziecko(mikolajek);

	}

	@Test
	public void sprawdzImieTest() {
		Assert.assertEquals("frajer", maurycy.getImie());
		Assert.assertEquals(Dziecko.DOMYSLNE_IMIE_DZIECKA, new Chlopiec().getImie());
		Assert.assertEquals(Dziecko.DOMYSLNE_IMIE_DZIECKA, new Dziewczynka().getImie());
	}
}
