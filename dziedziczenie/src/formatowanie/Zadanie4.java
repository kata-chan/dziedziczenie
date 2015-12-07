package formatowanie;

import java.util.Scanner;

public class Zadanie4 {
	// Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
	// nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych
	// liczb.
	public static void main(String[] args) {
		Scanner wpisz = new Scanner(System.in);

		int suma = 0;
		int liczba = 1;
		while (true) {
			System.out.println("podaj liczbe");
			liczba = wpisz.nextInt();
			if (liczba == 0) {
				break;
			}
			suma += liczba;

		}
		wpisz.close();
		System.out.println(suma);
	}
}