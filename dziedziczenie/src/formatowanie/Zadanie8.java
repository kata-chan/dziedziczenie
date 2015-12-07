package formatowanie;

import java.util.Scanner;

public class Zadanie8 {
	// 8. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
	// Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
	// wysokość choinki (liczbę wierszy).
	// Przykład: dla n = 5 wynik powinien wyglądać następująco:
	// *
	// ***
	// *****
	// *******
	// *********
	public static void main(String[] arg) {

		Scanner konsola = new Scanner(System.in);
		System.out.println("podaj liczbe całkowita");

		int n = konsola.nextInt();
		String gwiazdka = "*";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println(gwiazdka);
			gwiazdka += "**";
		}
		System.out.println("koniec petli");
		konsola.close();
	}
}
