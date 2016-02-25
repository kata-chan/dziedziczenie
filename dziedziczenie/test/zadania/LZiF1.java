package zadania;

import java.util.Scanner;

public class LZiF1 {
	// 1. Napisz funkcję, która zwraca wartość silni dla podanej liczby n. Funkcja powinna
	// być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej
	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj liczbe");
		int n = skaner.nextInt();
		skaner.close();

		System.out.println(String.format("%,d", silniaIteracyjna(n)));
		System.out.println(String.format("%,d", silniaRekurencyjna(n)));
	}

	private static int silniaIteracyjna(int n) {
		int silnia = 1;
		for (int i = 1; i <= n; i++) {
			silnia *= i;
		}
		return silnia;
	}

	public static int silniaRekurencyjna(int n) {
		if (n == 0) {
			return 1;
		}
		return n * silniaRekurencyjna(n - 1);
	}

}
