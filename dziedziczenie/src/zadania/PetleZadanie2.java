package zadania;

import java.util.Random;

public class PetleZadanie2 {
	// 2. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10,
	// a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza
	// się w tablicy.
	// Przykład:
	// Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
	// Wystąpienia:
	// 1 - 1
	// 2 - 1
	// 3 - 3
	// 4 - 3
	// 5 - 3
	// 6 - 4
	// 7 - 1
	// 8 - 2
	// 9 - 0
	// 10 - 2
	public static void main(String[] arg) {
		int[] calkowite = new int[20];
		Random r = new Random();
		int x = 10;
		int[] iloscLiczb = new int[x];

		System.out.println("Wylosowane liczby to:");
		for (int i = 0; i < calkowite.length; i++) {

			calkowite[i] = r.nextInt(x) + 1;
			System.out.print(calkowite[i] + " ");
			iloscLiczb[calkowite[i] - 1]++;
			//

		}
		System.out.println(" ");
		System.out.println("Wystapienia:");
		for (int i = 0; i < iloscLiczb.length; i++) {
			System.out.println((i + 1) + "-" + iloscLiczb[i]);

		}

	}

}
