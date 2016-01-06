package zadania;

import java.util.Scanner;

public class LancuchyZad1 {
	// Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie wy-
	// świetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
	// Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
	// ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4
	// razy.

	public static void main(String[] arg) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj słowo");
		String znaki = skaner.next();
		// String znaki2 = znaki.toLowerCase(); // zmienia na małe litery
		System.out.println(znaki.length()); // zwraca długość wyrazu
		int powtorzenia = 0;
		System.out.println(znaki.charAt((znaki.length() - 1))); // kiedy chcemy konkretna litere ---liczba
		for (int i = 0; i < znaki.length(); i++) {
			znaki.charAt(i);
			if (znaki.charAt(i) == znaki.charAt((znaki.length() - 1))) {
				powtorzenia++;
			}
		}
		System.out.println("ostatni znak powtarza sie " + powtorzenia + " razy");
		skaner.close();
	}
}
