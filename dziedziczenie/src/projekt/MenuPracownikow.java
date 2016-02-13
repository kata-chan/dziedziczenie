package projekt;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPracownikow {

	ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();

	static Scanner skaner = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		MenuPracownikow mp = new MenuPracownikow();
		mp.glownaPetla();

	}

	public static void wypiszMenu() {
		System.out.println("wybierz cyfre");
		System.out.println("1 - Wypisywanie listy wszystkich pracowników ");
		System.out.println("2 - Możliwość dodawania nowych pracowników");
		System.out.println("3 - Eksport ");
		System.out.println("4 - Usuwanie pracowników");
		System.out.println("5 - Edycja danych");
		System.out.println("6 - Dodatkowe funkcje ");
		System.out.println("7 - Dodatkowe funkcje dla plików tekstowych ");
		System.out.println("8 - Informacja o programie");
		System.out.println("9 - Wprowadzenie własnej nazwy pliku");
		System.out.println("10 - Wyjdz");

	}

	public void dodatkoweFunkcje() {

		System.out.println("wybierz litere");
		System.out.println("a - Obliczanie liczby pracowników z pensją nie mniejszą niż podana przez użytkownika");
		System.out.println("b - Obliczanie średniej płacy w dziale");
		System.out.println("c - Wyświetlanie największych pensji z wszystkich kobiety i wszystkich mężczyzny");
		System.out.println("d - Wyświetlenie wszystkich działów");
		System.out.println("e - Wyświetlenie stosunku średniej płacy kobiet do średniej płacy mężczyzn");
		System.out.println("f - Zwiększanie pensji wszystkim pracownikom o 10 procent oraz dodatkowo za specjalne cechy");
		System.out.println("g - Zwiększenie pensji wszystkim pracownikom o kwotę podaną przez użytkownika ");
		System.out.println("h - Sortowanie pracowników (w pliku) według nazwiska");
		System.out.println("i - Sortowanie pracowników (w pliku) według wysokości ich pensji");

		String literaWybrana = skaner.next();

		switch (literaWybrana) {
		case "a":
			obliczanieLiczbyPracownikowPensja();
			break;
		case "b":
			oblicznieSredniejPlacyWDziale();
			break;
		case "c":
			najwyzszePensje();
			break;
		case "d":
			wszystkieDzialy();
			break;
		case "e":
			sredniaPlacyKDoM();
			break;
		case "f":
			podwyzki();
			break;
		case "g":
			zwiekszeniePensjiWszystkimPracownikomOPodanaKwote();
			break;
		case "h":
			sortowaniePracownikowWgNazwiska();
			break;
		case "i":
			sortowaniePracownikowWgpensji();
			break;

		}
	}

	public void edytujdodatkoweFunkcjeDlaPlikowTekstowych() {

		System.out.println("Wybierz litre");
		System.out.println("a - Wyświetlenie danych (linii z pliku) o osobie z najdłuższym nazwiskiem.");
		System.out.println("b - Obliczenie średniego wieku osób posiadających dzieci.");
		System.out.println("c - Zakodowanie niektórych danych w pliku");
		System.out.println("d - Utworzenie pliku 'pracownicy.html' (tekstowy), w którym na podstawie pliku tekstowego o pracownikach\r\n" +
				"tworzona jest tabela zapisana w HTML");

		String literaWybrana = skaner.next();
		// dokonczyc
	}

	public void glownaPetla() throws FileNotFoundException {
		petla: while (true) {
			wypiszMenu();

			int liczbaWybrana = skaner.nextInt();

			switch (liczbaWybrana) {
			case 1:
				wypisanieListyWszystkichPracownikow();
				break;
			case 2:
				dodajPracownika();
				break;
			case 3:
				eksport();
				break;
			case 4:
				usunPracownika();
				break;
			case 5:
				edycjaDanych();
				break;
			case 6:
				dodatkoweFunkcje();

				break;
			case 7:
				edytujdodatkoweFunkcjeDlaPlikowTekstowych();

				break;
			case 8:
				informacjaOProgramie();
				break;
			case 9:
				wprowadzWlasnaNazwePliku();

				break;
			case 10:
				break petla;

			}

		}
	}

	public void dodajPracownika() {
		skaner.nextLine();
		System.out.println("podaj imie");
		String imie = skaner.nextLine();
		System.out.println("podaj nazwisko");
		String nazwisko = skaner.nextLine();
		System.out.println("podaj plec");
		String plec = skaner.next();
		char plec1 = plec.charAt(0);
		Pracownik nowy = new Pracownik(imie, nazwisko, plec1);
		System.out.println("podaj numer działu");
		nowy.setNrdzialu(skaner.nextInt());
		System.out.println("podaj płace");
		nowy.setPlace(skaner.nextFloat());
		System.out.println("podaj wiek");
		nowy.setWiek(skaner.nextInt());
		System.out.println("podaj liczbe dzieci");
		nowy.setDzieci(skaner.nextInt());
		System.out.println("podaj stan cywilny");
		nowy.setStanCywilny(skaner.nextBoolean());
		pracownicy.add(nowy);
	}

	private void edycjaDanych() {
		// TODO Auto-generated method stub

	}

	private void eksport() {
		// TODO Auto-generated method stub

	}

	private void informacjaOProgramie() {
		// TODO Auto-generated method stub

	}

	private void najwyzszePensje() {
		// TODO Auto-generated method stub

	}

	private void obliczanieLiczbyPracownikowPensja() {
		// TODO Auto-generated method stub

	}

	private void oblicznieSredniejPlacyWDziale() {
		// TODO Auto-generated method stub

	}

	private void podwyzki() {
		// TODO Auto-generated method stub

	}

	private void sortowaniePracownikowWgNazwiska() {
		// TODO Auto-generated method stub

	}

	private void sortowaniePracownikowWgpensji() {
		// TODO Auto-generated method stub

	}

	private void sredniaPlacyKDoM() {
		// TODO Auto-generated method stub

	}

	private void usunPracownika() {
		// TODO Auto-generated method stub

	}

	private void wprowadzWlasnaNazwePliku() {
		// TODO Auto-generated method stub

	}

	private void wszystkieDzialy() {
		// TODO Auto-generated method stub

	}

	private void wypisanieListyWszystkichPracownikow() {
		for (Pracownik pracownik : pracownicy) {
			pracownik.wyswietlanieOkrojone();
		}
	}

	private void zwiekszeniePensjiWszystkimPracownikomOPodanaKwote() {
		// TODO Auto-generated method stub

	}
}
