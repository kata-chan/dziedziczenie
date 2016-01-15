package zadania;

import java.util.Scanner;

public class LZiF4 {
	// 4. Napisać funkcję String flipCase(String text) , która zamieni małe litery na
	// duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
	// znaków zawierający kopię łańcucha po zmianie wielkości liter.

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wstaw tekst");
		String text = skaner.nextLine();
		skaner.close();
		String wynik = flipCase(text);
		System.out.println(wynik);

	}

	public static String flipCase(String text) {
		String zmieniony = "";
		for (int i = 0; i < text.length(); i++) {
			char znak = text.charAt(i);
			if (znak >= 'A' && znak <= 'Z') {
				znak += 32;
			} else if (znak >= 'a' && znak <= 'z') {
				znak -= 32;
			}
			zmieniony += znak;
		}
		return zmieniony;
	}
}
