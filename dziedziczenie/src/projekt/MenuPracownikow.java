package projekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MenuPracownikow {

	ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();

	static Scanner skaner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		MenuPracownikow mp = new MenuPracownikow();
		String nazwa = "pracownicy.txt";
		mp.wprowadzWlasnaNazwePliku(nazwa);

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
		System.out
				.println("f - Zwiększanie pensji wszystkim pracownikom o 10 procent oraz dodatkowo za specjalne cechy");
		System.out.println("g - Zwiększenie pensji wszystkim pracownikom o kwotę podaną przez użytkownika ");
		System.out.println("h - Sortowanie pracowników (w pliku) według nazwiska");
		System.out.println("i - Sortowanie pracowników (w pliku) według wysokości ich pensji");

		String literaWybrana = skaner.nextLine();

		switch (literaWybrana) {
		case "a":
			System.out.println("podaj wielkosc pensji");
			float pensjaPorownywana = skaner.nextFloat();
			ObliczanieLiczbyPracownikowZPensjaNieMniejszaNizPodanaPrzezUzytkownika(pensjaPorownywana);
			break;
		case "b":
			System.out.println("Podaj numer działu:");
			int numerDzialu = skaner.nextInt();
			oblicznieSredniejPlacyWDziale(numerDzialu);
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
			System.out.println("Sortuj w kolejności (true - rosnąco, false - malejąco)");
			boolean kolejnosc = Boolean.valueOf(skaner.nextLine());
			sortowaniePracownikowWgNazwiska(kolejnosc);
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
		System.out.println("d - Utworzenie pliku 'pracownicy.html' (tekstowy), w którym na podstawie pliku tekstowego o pracownikach\r\n"
				+ "tworzona jest tabela zapisana w HTML");

		String literaWybrana = skaner.nextLine();

		switch (literaWybrana) {
		case "a":
			osobaZNajdluzszymNazwiskiem();
			break;
		case "b":
			sredniWiekOsPosiadajacychDzieci();
			break;
		case "c":
			zakodowanieDanychWPliku();
			break;
		case "d":
			pracownicyHTML();
			break;

		}
	}

	private void osobaZNajdluzszymNazwiskiem() {

		Pracownik dlugieNazwisko = new Pracownik();
		dlugieNazwisko.setNazwisko("Bzz");

		for (Pracownik pracownik : pracownicy) {
			if (pracownik.getNazwisko().length() > dlugieNazwisko.getNazwisko().length()) {
				dlugieNazwisko = pracownik;
			}
		}
		System.out.println("pracownik z najdluzszym nazwikskiem:");
		dlugieNazwisko.wyswietlanieOkrojone();
	}

	private void pracownicyHTML() {
		// TODO Auto-generated method stub

	}

	private void zakodowanieDanychWPliku() {
		int osoba = 0;
		float suma = 0;

		for (Pracownik pracownik : pracownicy) {
			suma += pracownik.getPlace();
			osoba++;
		}
		float srednia = suma / osoba;
		System.out.println("srednia placa: " + srednia);
		String zakodowaneNazwisko = "";
		for (Pracownik pracownik : pracownicy) {
			StringBuffer sb = new StringBuffer();
			if (srednia < pracownik.getPlace()) {
				sb.append(pracownik.getNazwisko().charAt(0));
				for (int i = 1; i < pracownik.getNazwisko().length(); i++) {
					sb.append('*');
				}
				zakodowaneNazwisko = sb.toString();
				pracownik.setNazwisko(zakodowaneNazwisko);
			}
			System.out.println(zakodowaneNazwisko);
		}
	}

	private void sredniWiekOsPosiadajacychDzieci() {
		int osoba = 0;
		int suma = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik.getDzieci() > 0) {
				suma += pracownik.getWiek();
				osoba++;
			}
		}
		System.out.println("średni wiek osob posiadających dzieci:" + suma / osoba);
	}

	public void glownaPetla() throws IOException {
		petla: while (true) {
			wypiszMenu();

			String menuStr = skaner.nextLine();
			int liczbaWybrana = Integer.parseInt(menuStr);

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
				System.out.println("podaj własną nazwę pliku");
				String nowaNazwa = skaner.nextLine();
				wprowadzWlasnaNazwePliku(nowaNazwa);

				break;
			case 10:
				break petla;

			}

		}
	}

	public void dodajPracownika() {
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
		int numerPola = 0;
		for (Pracownik pracownik : pracownicy) {
			numerPola++;
			System.out.print(numerPola + ". ");
			pracownik.wyswietlDaneOPracowniku();
		}

		System.out.println("wybierz numer indeksu pracownika, którego chcesz edytować");
		int indeks = skaner.nextInt();

		Pracownik pracownikEdytowany = pracownicy.get(indeks - 1);
		pracownikEdytowany.wyswietlanieSpecjalne();
		int liczba;
		do {
			System.out.println("Podaj co chcesz edytować");
			System.out.println("1.nazwisko");
			System.out.println("2.numer działu");
			System.out.println("3.płaca");
			System.out.println("4.wiek");
			System.out.println("5.liczba dzieci");
			System.out.println("6.stan cywilny");
			liczba = skaner.nextInt();
		} while (liczba < 1 || liczba > 6);

		System.out.println("podaj nową wartość");
		switch (liczba) {
		case 1:
			pracownikEdytowany.setNazwisko(skaner.next());
			break;
		case 2:
			pracownikEdytowany.setNrdzialu(skaner.nextInt());
			break;
		case 3:
			pracownikEdytowany.setPlace(skaner.nextInt());
		case 4:
			pracownikEdytowany.setWiek(skaner.nextInt());
			break;
		case 5:
			pracownikEdytowany.setDzieci(skaner.nextInt());
			break;
		case 6:
			pracownikEdytowany.setStanCywilny(skaner.nextBoolean());
			// case 7:
			// break;
		}

	}

	private void eksport() throws IOException {
		System.out.println("podaj nazwę pliku ");
		String nazwaPliku = skaner.next();
		String nazwaPlikuTxt = nazwaPliku + ".txt";
		File plik = new File(nazwaPlikuTxt);
		FileWriter filewriter = new FileWriter(plik);
		for (Pracownik pracownik : pracownicy) {
			filewriter.write(pracownik.getNazwisko() + " " + pracownik.getImie() + " " + pracownik.getPlec() + " "
					+ pracownik.getNr_dzialu() + " " + pracownik.getWiek() + " " + pracownik.getPlace() + " "
					+ pracownik.getDzieci() + " " + pracownik.getStanCywilny() + " \n");
		}
		filewriter.close();

	}

	private void informacjaOProgramie() {
		// TODO Auto-generated method stub

	}

	private void najwyzszePensje() {
		float maxK = Float.MIN_VALUE;
		float maxM = Float.MIN_VALUE;
		float najK = 0;
		float najM = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik.getPlec() == 'K') {
				if (pracownik.getPlace() > maxK) {
					maxK = pracownik.getPlace();
				}
			}
			if (pracownik.getPlec() == 'M') {
				if (pracownik.getPlace() > maxM) {
					maxM = pracownik.getPlace();
				}
			}
		}
		System.out.println("największa pensja kobiety: " + maxK);
		System.out.println("największa pensja mężczyzny: " + maxM);

	}

	private void ObliczanieLiczbyPracownikowZPensjaNieMniejszaNizPodanaPrzezUzytkownika(float pensjaPodana) {

		int pracownicyPowyzejPensji = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik.pensjaPowWart(pensjaPodana) == true) {
				pracownicyPowyzejPensji++;
			}
		}
		System.out.println("pracownicy powyżej pensji: " + pracownicyPowyzejPensji);

	}

	private void oblicznieSredniejPlacyWDziale(int numerDzialu) {
		int liczbaPracownikow = 0;
		float suma = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik.getNr_dzialu() == numerDzialu) {
				liczbaPracownikow++;
				suma += pracownik.getPlace();
			}
		}
		System.out.println("srednia płaca w dziale:");
		System.out.println(suma / liczbaPracownikow);

	}

	private void podwyzki() {
		for (Pracownik pracownik : pracownicy) {
			// float place = pracownik.getPlace();
			// place = place + (place * (10 / 100.f));
			// pracownik.setPlace(place);
			pracownik.obliczaniePodwyzki(10);
		}

	}

	class NazwiskoCompare implements Comparator<Pracownik> {
		boolean rosnaco;

		public NazwiskoCompare(boolean rosnaco) {
			this.rosnaco = rosnaco;
		}

		@Override
		public int compare(Pracownik a1, Pracownik a2) {
			int wynik = a1.getNazwisko().toUpperCase().compareTo(a2.getNazwisko().toUpperCase());
			if (rosnaco) {
				return wynik;// wynik porownania, sortowanie rosnace
			} else {
				return -wynik;// wynik przeciwny porownania, sortowanie malejace
			}
		}
	}

	class PlaceCompare implements Comparator<Pracownik> {
		@Override
		public int compare(Pracownik a1, Pracownik a2) {
			return Float.valueOf(a1.getPlace()).compareTo(Float.valueOf(a2.getPlace()));
		}
	}

	private void sortowaniePracownikowWgNazwiska(boolean rosnaco) {
		NazwiskoCompare nc = new NazwiskoCompare(rosnaco);
		Collections.sort(pracownicy, nc);

	}

	private void sortowaniePracownikowWgpensji() {
		PlaceCompare pc = new PlaceCompare();
		Collections.sort(pracownicy, pc);

	}

	private void sredniaPlacyKDoM() {
		float sumaK = 0;
		float sumaM = 0;
		int k = 0;
		int m = 0;
		for (Pracownik pracownik : pracownicy) {
			if (pracownik.getPlec() == 'K') {
				sumaK += pracownik.getPlace();
				k++;
			}
			if (pracownik.getPlec() == 'M') {
				sumaM += pracownik.getPlace();
				m++;
			}

		}
		float srPlK = sumaK / k;
		float srPlM = sumaM / m;
		System.out.println("srednia płacy kobiet: " + srPlK);
		System.out.println("srednia płacy mężczyzn: " + srPlM);
		System.out.println("stosunek redniej płacy kobiet do średniej płacy mężczyzn: " + srPlK / srPlM);
	}

	private void usunPracownika() {
		int numerPola = 0;
		for (Pracownik pracownik : pracownicy) {
			numerPola++;
			System.out.print(numerPola + ". ");
			pracownik.wyswietlDaneOPracowniku();
		}
		System.out.println("wybierz numer indeksu pracownika, którego chcesz usunąć");
		int indeks = skaner.nextInt();
		pracownicy.remove(indeks - 1);
	}

	private void wprowadzWlasnaNazwePliku(String plik) throws IOException {
		FileReader fr = new FileReader(plik);
		BufferedReader br = new BufferedReader(fr);
		while (true) {
			String wers = br.readLine();
			if (wers == null) {
				break;
			}
			String[] wczytywani = wers.split(" ");
			Pracownik nowy = new Pracownik();
			nowy.setImie(wczytywani[1]);
			nowy.setNazwisko(wczytywani[0]);
			char plec = (wczytywani[2]).charAt(0);
			nowy.setPlec(plec);
			nowy.setNrdzialu(Integer.parseInt(wczytywani[3]));
			nowy.setWiek(Integer.parseInt(wczytywani[4]));
			nowy.setPlace(Float.parseFloat(wczytywani[5]));
			nowy.setDzieci(Integer.parseInt(wczytywani[6]));
			nowy.setStanCywilny(Boolean.parseBoolean(wczytywani[7]));
			pracownicy.add(nowy);
		}

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
