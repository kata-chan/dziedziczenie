package zadania;

import java.util.Random;
import java.util.Scanner;

public class ZadaniaProste2 {
	// 2. Napisać program, który wczytuje od użytkownika liczby dopóty, dopóki nie zostanie podana liczba
	// mniejsza od 1. Następnie dokonuje losowania tylu liczb, ile wynosiła maksymalna z wartości podanych przez
	// użytkownika. Zakres losowanych liczb, to -199 do 199. W wyniku powinien zostać wyświetlony stosunek
	// średniej arytmetycznej wszystkich „co drugich" wylosowanych liczb dodatnich do wszystkich co trzecich
	// wylosowanych liczb (można zacząć od dowolnego momentu, ale nie później niż od 2 i 3 z podanych liczb).
	// W programie nie należy używać tablic

	public static void main(String[] args) {
		int liczby1 = 0;
		int liczby2 = 0;
		int wylosowana = 0;
		double suma2 = 0;
		double suma1 = 0;
		Random losowa = new Random();
		int liczbaMax = Integer.MIN_VALUE;
		Scanner konsola = new Scanner(System.in);
		while (true) {

			System.out.println("podaj liczbe");
			int liczba = konsola.nextInt();
			if (liczba < 1) {
				break;
			}
			if (liczba > liczbaMax) {
				liczbaMax = liczba;
			}

		}
		System.out.println("maksymalna wartosc " + liczbaMax);
		konsola.close();

		for (int i = 0; i < liczbaMax; i++) {
			wylosowana = losowa.nextInt(199 - (-199) + 1) - 199;
			System.out.println("wylosowana: indeks " + i + "liczba " + wylosowana);
			if (i % 2 == 1) {
				suma1 += wylosowana;
				liczby1++;

			}
			if (i % 3 == 2) {
				suma2 += wylosowana;
				liczby2++;
			}
		}
		System.out.println("suma co drugich " + suma1);
		System.out.println("ilosc liczb co drugich " + liczby1);
		System.out.println("suma co trzecich " + suma2);
		System.out.println(" ilosc liczb co trzecich " + liczby2);
		double sa1 = suma1 / liczby1;
		double sa2 = suma2 / liczby2;
		System.out.println("srednia arytmetyczna liczb co drugich; " + sa1);
		System.out.println("srednia arytmetyczbna liczb co trzecich; " + sa2);
		System.out.println("stosunek średniej arytmetycznej wszystkich co drugich wylosowanych liczb dodatnich do wszystkich co trzecich wylosowanych liczb "
				+ sa1 / sa2);
	}
}
