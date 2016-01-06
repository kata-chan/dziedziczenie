package zadania;

import java.util.Scanner;

public class LancuchyZad4 {
	// 4. Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
	// Przykład:
	// "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
	// Wynik:
	// 6
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj slowo");
		String slowo = skaner.nextLine();
		int suma = 0;
		skaner.close();
		for (int i = 0; i < slowo.length(); i++) {
			char znak = slowo.charAt(i);
			if (znak >= '0' && znak <= '9') {
				suma += znak - '0';
			}
		}
		System.out.println(suma);
	}
}
