package zadania;

import java.util.Scanner;

public class Zadanie7 {
	// Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie
	// prostokąt. Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
	// górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
	// że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
	// Przykład: x=6, y=3, a=4, b=6, zn=’x’
	// >
	// >
	// > _____xxxxxx
	// > _____xxxxxx
	// > _____xxxxxx
	// > _____xxxxxx
	// ozn.
	// > - nowa linia,
	// _ - znak spacji.
	public static void main(String[] args) {

		Scanner konsola = new Scanner(System.in);
		System.out.println("podaj mi x");
		int x = konsola.nextInt();
		System.out.println("podaj mi y");
		int y = konsola.nextInt();
		System.out.println("podaj mi a");
		int a = konsola.nextInt();
		System.out.println("podaj mi b");
		int b = konsola.nextInt();
		System.out.println("podaj znak wypelnienia prostokata");
		String znak = konsola.next();
		konsola.close();

		for (int c = 0; c < y - 1; c++) {
			System.out.println("");

		}
		for (int i = 0; i < a; i++) {
			for (int d = 0; d < x; d++) {
				System.out.print(" ");
			}
			for (int j = 0; j < b; j++) {
				System.out.print(znak);
			}
			System.out.println();
		}

	}
}
