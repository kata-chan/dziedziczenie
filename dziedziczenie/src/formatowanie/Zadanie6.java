package formatowanie;

import java.util.Scanner;

public class Zadanie6 {
	// 6. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
	// (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
	// wartości. Jeżeli podana wartość jest:
	// • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
	// • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
	// • identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
	// się kończy.
	public static void main(String[] arg) {

		int liczbaWylosowana = (int) (Math.random() * 100 + 1);

		Scanner konsola = new Scanner(System.in);

		while (true) {
			System.out.println("podaj typowana liczbe");
			int liczba = konsola.nextInt();
			if (liczba == liczbaWylosowana) {
				System.out.println("Gratulacje");
				break;
			} else if (liczbaWylosowana < liczba) {
				System.out.println("podałes za duza wartosc");

			} else {
				System.out.println("podales za mala wartosc");
			}
		}
		konsola.close();
	}

}
