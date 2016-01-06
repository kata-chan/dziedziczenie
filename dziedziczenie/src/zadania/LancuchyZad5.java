package zadania;

import java.util.Scanner;

public class LancuchyZad5 {
	// . Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
	// arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
	// pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
	// Przykład a:
	// "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
	// Wynik:
	// Błędne sparowanie nawiasów
	// Przykład b:
	// "2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
	// Wynik:
	// OK
	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("wpisz dzialanie");
		String haslo = skaner.nextLine();
		int lewy = 0;
		int prawy = 0;
		skaner.close();
		for (int i = 0; i < haslo.length(); i++) {
			char znak = haslo.charAt(i);
			if (znak == '(') {
				lewy++;
			}
			if (znak == ')') {
				prawy++;
			}

		}
		if (lewy == prawy) {
			System.out.println("ok");
		} else {
			System.out.println("bledne sparowanie nawiasow");
		}

	}
}
