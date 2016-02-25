package zadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlikiTekstowe2 {
	// 2. Napisać funkcję:
	// public static void szukaj(String nazwaPlikWe, String nazwaPlikWy,
	// String slowo)
	// której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane
	// słowo. Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w
	// pliku wynikowym wraz z nr wiersza (z pierwszego pliku). Nazwa pierwszego pliku
	// zapamiętana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana
	// jest w parametrze nazwaPlikWy, natomiast szukane słowo w parametrze slowo.
	// Przykład - plik wejściowy:
	// Ala ma jutro egzamin z biologii.
	// Jan myje auto.
	// Eh, jutro kolejny egzamin.
	// Nie lubie polityki.
	// Jeżeli szukanym słowem byłoby ”egzamin”, to plik wynikowy powinien wyglądać
	// następująco:
	// 1: Ala ma jutro egzamin z biologii.
	// 3: Eh, jutro kolejny egzamin.

	public static void main(String[] arg) throws IOException {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku w którym szukac");
		String nazwaPlikuWe = skaner.nextLine();
		System.out.println("podaj slowo");
		String slowo = skaner.nextLine();
		System.out.println("podaj nazwe pliku w ktorym zapisac wyniki");
		String nazwaPlikuWy = skaner.nextLine();
		szukaj(nazwaPlikuWe, nazwaPlikuWy, slowo);

		skaner.close();

	}

	public static void szukaj(String nazwaPlikuWe, String nazwaPlikuWy, String slowo) throws IOException {

		int pozycja = 0;
		int wiersz = 0;
		// File plik = new File(nazwaPlikuWe);
		FileReader fileReader = new FileReader(nazwaPlikuWe);
		BufferedReader reader = new BufferedReader(fileReader);
		// File plik2=new File(nazwaPlikuWy);
		FileWriter zapis = new FileWriter(nazwaPlikuWy);

		while (true) {
			String wers = reader.readLine();
			if (wers == null) {
				break;
			}

			wiersz++;
			pozycja = wers.indexOf(slowo);
			if (pozycja > 0) {
				zapis.write(wiersz + ":" + wers + "\n");

			}

		}
		zapis.close();
	}

}
