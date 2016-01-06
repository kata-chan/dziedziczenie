package zadania;

import java.util.Scanner;

public class LancuchyZad3 {
	// Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie sprawdza,
	// czy podany ciąg jest palindromem.

	public static void main(String[] arg) {

		boolean werdykt = true;
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj slowo");
		String slowo = skaner.next();
		skaner.close();
		int dlugoscTablicy = slowo.length();
		for (int i = 0; i < slowo.length(); i++) {
			if (slowo.charAt(i) != slowo.charAt(dlugoscTablicy - i - 1)) {
				werdykt = false;
				break;

			}
		}
		if (werdykt) {
			System.out.println("slowo  jest palindromem");
		} else {
			System.out.println("slowo  nie jest palindromem");
		}
	}
}