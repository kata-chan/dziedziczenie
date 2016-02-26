package zadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlikiTekstowe4 {
	// 4. Stworzyć dwie funkcje:
	// void szyfruj(String nazwaWe, int przesun)
	// void deszyfruj(String nazwaWe, int przesun)
	// Funkcja szyfruj dokonuje szyfrowania pliku, którego nazwa podana została jako
	// pierwszy parametr. Szyfrowanie polega na zamianie każdej litery na znak przesunięty
	// o wartość podaną drugim parametrem np. dla przesunięcia równego 2 literka
	// ’a’ powinna zostać zastąpiona literką ’c’, literka ’z’ literką ’b’ itp.
	// Wynikiem działania funkcji ma być plik o nazwie utworzonej na podstawie nazwy
	// pliku wejściowego poprzez dołączenie znaku ’ ’ np. dla pliku dane.txt zaszyfrowana
	// postać powinna mieć nazwę dane.txt. Funkcja deszyfruj powinna deszyfrować plik
	// (niekoniecznie ten sam) zaszyfrowany przez funkcję szyfruj.
	public static void main(String[] arg) throws IOException {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku szyfrowanego");
		String nazwaWe = skaner.nextLine();
		szyfruj(nazwaWe, 2);
		skaner.close();

	}

	public static void szyfruj(String nazwaWe, int przesun) throws IOException {

		// File plik = new File(nazwaPlikuWe);
		FileReader fileReader = new FileReader(nazwaWe);
		BufferedReader reader = new BufferedReader(fileReader);
		String nazwaPlikuZa = '_' + nazwaWe;
		File plik = new File(nazwaPlikuZa);
		FileWriter zapis = new FileWriter(nazwaPlikuZa);
		while (true) {

			String wyraz = reader.readLine();
			if (wyraz == null) {
				break;
			}
			String wyraz2 = wyraz.toLowerCase();

			for (int i = 0; i < wyraz2.length(); i++) {
				char znak = wyraz2.charAt(i);

				if (znak >= 'a' && znak <= 'z') {
					char c = (char) (znak + przesun);

					while (c > 'z') {
						c -= 'z' - 'a' + 1;
					}
					znak = c;
				}
				zapis.write(znak);
				// if (znak == '.' || znak == ',') {
				// zapis.write(" " + "\n");
			}
			zapis.write(" " + "\n");
		}
		zapis.close();
		deszyfruj(nazwaPlikuZa, 2);
	}

	public static void deszyfruj(String nazwaPlikuZa, int przesun) throws IOException {

		FileReader fileReader = new FileReader(nazwaPlikuZa);
		BufferedReader reader = new BufferedReader(fileReader);
		String plikOdszyfrowany = " Odszyfr" + nazwaPlikuZa;
		File plik = new File(plikOdszyfrowany);
		FileWriter odszyfr = new FileWriter(plikOdszyfrowany);
		while (true) {

			String wyraz = reader.readLine();
			if (wyraz == null) {
				break;
			}

			for (int i = 0; i < wyraz.length(); i++) {
				char znak = wyraz.charAt(i);

				if (znak >= 'a' && znak <= 'z') {
					char c = (char) (znak - przesun);

					while (c < 'a') {
						c += 'z' - 'a' + 1;
					}
					znak = c;
				}
				odszyfr.write(znak);

			}
			odszyfr.write(" " + "\n");
		}
		odszyfr.close();
	}
}
