package dziedziczenie;

import java.util.Date;

public class CzlowiekTester extends Czlowiek {
	public static void main(String[] args) {

		Dziewczynka magma = new Dziewczynka();

		Mezczyzna maurycy = new Mezczyzna();

		Kobieta kunegunda = new Kobieta();
		Chlopiec mikolajek = new Chlopiec();

		mikolajek.setImie("mikolaj");
		magma.setImie("pulpecik");
		maurycy.setImie("frajer");
		kunegunda.setImie("lachon");
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
		mikolajek.dodajZainteresowanie("mobbing");

		magma.przedstawSie();
		maurycy.przedstawSie();
		kunegunda.przedstawSie();
		mikolajek.przedstawSie();

		Rodzina nowaRodzina = new Rodzina();
		nowaRodzina.setMama(kunegunda);
		nowaRodzina.setTata(maurycy);

		System.out.println(nowaRodzina.dodajDziecko(magma));
		System.out.println(nowaRodzina.dodajDziecko(magma));

	}
}