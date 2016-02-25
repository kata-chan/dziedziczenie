package zadania;

import java.util.Scanner;

public class LZiF2 {
	// 2. Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. Funkcja
	// powinna być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
	// Ciąg Fibonacciego dany jest wzorem:
	// Fn =
	// 1 gdy n = 0 ,
	// 2 gdy n = 1 ,
	// Fn−2 + Fn−1 gdy n > 1 .

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj liczbe");
		int n = skaner.nextInt();
		skaner.close();

		System.out.println(String.format("%,d", ciagFIteracyjna(n)));
		System.out.println(String.format("%,d", ciagFRekurencyjna(n)));
	}

	private static int ciagFIteracyjna(int n) {
		int a = 0;
		int b = 1;
		for (int i = 1; i < n; i++) {
			int c = a + b;
			if (a < b) {
				a = c;
			} else {
				b = c;
			}

		}
		return Math.max(a, b);
	}

	public static int ciagFRekurencyjna(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return ciagFRekurencyjna(n - 1) + ciagFRekurencyjna(n - 2);

	}

}
