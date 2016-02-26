package zadania;

import java.util.Scanner;

public class LZiF3 {
	// 3. Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
	// na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
	// Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
	// Uwaga - pozycje znaków numerujemy począwszy od 0.

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj tekst");
		String text = skaner.nextLine();
		System.out.println("podaj znak");
		String z = skaner.next();
		skaner.close();
		int wynik = strpos(text, z.charAt(0));
		System.out.println(wynik);
	}

	public static int strpos(String text, char z) {

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == z) {
				return i;
			}

		}
		return -1;

	}
}
