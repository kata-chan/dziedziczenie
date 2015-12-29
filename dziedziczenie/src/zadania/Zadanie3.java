package zadania;

import java.util.Scanner;

public class Zadanie3 {
	// Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
	// następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
	// liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
	// 1
	// 2
	// 4
	// 8
	// 16
	// 32
	// 64

	public static void main(String[] args) {

		Scanner wczyt = new Scanner(System.in);
		System.out.println("Podaj liczbe calkowita dodatnia");
		int liczba = wczyt.nextInt();
		wczyt.close();
		if (liczba > 0) {

			int potega = 1;
			while (potega < liczba) {
				System.out.println(potega);
				potega = (potega * 2);
			}
		}
	}
}