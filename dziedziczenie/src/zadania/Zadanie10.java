package zadania;

import java.util.Scanner;

public class Zadanie10 {
	// 10. Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo,
	// dla liczby 21 dzielniki to: 1, 3, 7, 21.

	public static void main(String[] arg) {
		Scanner konsola = new Scanner(System.in);
		System.out.println("podaj liczbe całkowita");

		int n = konsola.nextInt();
		System.out.println("dla liczby " + n + " dzielniki to:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}

		}
		konsola.close();
	}

}
