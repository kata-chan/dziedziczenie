package zadania;

import java.util.Random;

public class PetleZadanie1 {
	// 1. Napisać program, który:
	// • utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
	// przedziału [−10, . . . , 10],
	// • wypisze na ekranie zawartość tablicy,
	// • wyznaczy najmniejszy oraz najwięszy element w tablicy,
	// • wyznaczy średnią arytmetyczną elementów tablicy,
	// • wyznaczy ile elementów jest mniejszych, ile większych od średniej.
	// • wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego
	// do pierwszego.
	// Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
	// Wylosowane liczby:
	// -3 9 2 -10 -3 -4 -1 -5 -10 8
	// Min: -10, max: 9
	// Średnia: -1,00
	// Mniejszych od śr.: 6
	// Większych od śr.: 3
	// Liczby w odwrotnej kolejności:
	// 8 -10 -5 -1 -4 -3 -10 2 9 -3

	public static void main(String[] arg) {

		int[] liczbyCalkowite = new int[10];

		System.out.println("wylosowane liczby:");
		Random r = new Random();
		int liczbaMin = Integer.MAX_VALUE;
		int liczbaMax = Integer.MIN_VALUE;
		int suma = 0;
		for (int i = 0; i < liczbyCalkowite.length; i++) {
			liczbyCalkowite[i] = r.nextInt(21) - 10;
			if (liczbyCalkowite[i] < liczbaMin) {
				liczbaMin = liczbyCalkowite[i];
			}
			if (liczbyCalkowite[i] > liczbaMax) {
				liczbaMax = liczbyCalkowite[i];
			}

			System.out.print(liczbyCalkowite[i] + " ");
			suma += liczbyCalkowite[i];
		}

		System.out.println("");
		System.out.println("Min" + liczbaMin + ", max:" + liczbaMax);
		System.out.println("średnia:" + suma / 10);
		System.out.println("średnia:" + suma / (liczbyCalkowite.length + 1));
		System.out.println("Liczby w odwrotnej kolejnosci");
		for (int j = (liczbyCalkowite.length - 1); j < liczbyCalkowite.length; j--) {

			System.out.print(liczbyCalkowite[j] + " ");
		}
	}
}
