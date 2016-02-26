package zadania;

import java.util.Scanner;

public class ZadaniaProste1 {

	// 1. Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
	// Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
	// podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.
	// Przykład:
	// 4 2 3 6 1 6 1 0
	// Wynik:
	// 7 1 2

	public static void main(String[] args) {

		Scanner konsola = new Scanner(System.in);

		int suma = 0;
		int podzielonePrzez3 = 0;
		int dzielnik = 0;
		while (true) {
			System.out.println("podaj liczbe");
			int liczba = konsola.nextInt();

			if (liczba == 150) {
				break;
			}
			if (liczba % 3 == 0) {
				podzielonePrzez3++;
			}
			suma += liczba;
			dzielnik++;

		}
		konsola.close();
		double srednia = (double) suma / dzielnik;
		System.out.println("suma:" + suma);
		System.out.println("srednia:" + srednia);
		System.out.println("liczby podzielone przez 3: " + podzielonePrzez3);
	}
}
