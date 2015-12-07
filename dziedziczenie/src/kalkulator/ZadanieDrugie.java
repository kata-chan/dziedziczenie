package kalkulator;

import java.util.Scanner;

public class ZadanieDrugie {
	// Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
	// A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
	// (A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
	// while, do-while, for.
	// Przykład:
	// Dla A = 4 i B = 11 program powinien wyświetlić:
	// 60
	// 60

	public static void main(String[] args) {

		System.out.println("Podaj liczbe A");
		Scanner liczba = new Scanner(System.in);

		int one = liczba.nextInt();
		System.out.println("Podaj liczbe B");
		int two = liczba.nextInt();
		liczba.close();
		int b = Math.max(one, two);
		int a = Math.min(one, two);
		int suma = 0;
		for (int i = a; i <= b; i++) {
			suma += i;
		}
		System.out.println(suma);

		suma = 0;

		int i = a;
		while (i <= b) {
			suma += i;
			i++;
		}
		System.out.println(suma);

		suma = 0;
		i = a;
		do {
			suma += i;
			i++;
		} while (i <= b);
		System.out.println(suma);
	}
}
