package zadania;

import java.util.Scanner;

public class LancuchyZad2 {
	// 2. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy
	// łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
	// Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.

	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj słowo");
		String znaki = skaner.next();
		// System.out.println(znaki.length()); // zwraca długość wyrazu
		String now = "";
		for (int i = ((znaki.length()) - 1); i >= 0; i--) {
			now += znaki.charAt(i);

		}
		System.out.println(now);
		System.out.println("sposob drugi");
		String reverse = new StringBuffer(znaki).reverse().toString();
		System.out.println(znaki);
		System.out.println(reverse);
		skaner.close();
	}
}
