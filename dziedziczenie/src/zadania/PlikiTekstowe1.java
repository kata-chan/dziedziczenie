package zadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PlikiTekstowe1 {
	// 1. Napisać funkcję liczZnakiSlowa, która zlicza:
	// • liczbę znaków w pliku,
	// • liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik
	// końca wiersza),
	// • liczbę słów w pliku.
	// Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych
	// podpunktów.

	public static void main(String[] arg) throws IOException {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku");
		String nazwaPliku = skaner.nextLine();
		skaner.close();

		System.out.println(Arrays.toString(liczZnakiSlowa(nazwaPliku)));
	}

	public static int[] liczZnakiSlowa(String nazwaPliku) throws IOException {
		int[] tablica = new int[3];
		// File plik = new File(nazwaPliku);
		FileReader fileReader = new FileReader(nazwaPliku);
		BufferedReader reader = new BufferedReader(fileReader);
		while (true) {
			String wyraz = reader.readLine();
			if (wyraz == null) {
				break;
			}
			tablica[2]++;
			wyraz = wyraz.toLowerCase();
			char poprzedniZnak = ' ';
			for (int j = 0; j < wyraz.length(); j++) {
				char aktualnyZnak = wyraz.charAt(j);
				if (Character.isWhitespace(poprzedniZnak) && !(Character.isWhitespace(aktualnyZnak))) {
					tablica[0]++;
				}
				poprzedniZnak = aktualnyZnak;
				if (aktualnyZnak >= 'a' && aktualnyZnak <= 'z') {
					tablica[1]++;
				}
				if (Character.isWhitespace(aktualnyZnak)) {
					tablica[2]++;
				}
			}

		}
		return tablica;
	}

}
