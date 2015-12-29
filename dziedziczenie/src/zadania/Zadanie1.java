package zadania;

import java.util.Scanner;

public class Zadanie1 {
	// Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie
	// wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
	// podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
	// 15
	public static void main(String[] args) {

		System.out.println("podaj dodatnia liczbe calkowita;");

		Scanner podaj = new Scanner(System.in);
		int liczba = podaj.nextInt();
		podaj.close();
		if (liczba > 0) {
			for (int i = 1; i <= liczba; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}

			}

		}
	}
}
