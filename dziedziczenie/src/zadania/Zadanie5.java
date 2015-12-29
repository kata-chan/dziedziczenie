package zadania;

import java.util.Scanner;

public class Zadanie5 {
	// Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
	// danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
	// kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
	// podanych liczb oraz ich średnią arytmetyczną.

	public static void main(String[] args) {
		Scanner wpisz = new Scanner(System.in);
		int liczbaMin = Integer.MAX_VALUE;
		int liczbaMax = Integer.MIN_VALUE;
		int ilosc = 0;
		int suma = 0;
		int liczba = 1;
		while (true) {
			System.out.println("podaj liczbe");
			liczba = wpisz.nextInt();
			if (liczba == 0) {
				break;
			}
			if (liczba < liczbaMin) {
				liczbaMin = liczba;
			}
			if (liczba > liczbaMax) {
				liczbaMax = liczba;
			}
			ilosc++;
			suma += liczba;

		}

		wpisz.close();
		System.out.println("suma=" + suma);
		System.out.println("srednia=" + (suma / ilosc));
		System.out.println("liczba minimalna=" + liczbaMin);
		System.out.println("liczba maksymalna=" + liczbaMax);
		System.out.println("sumaMaxMin=" + (liczbaMax + liczbaMin));
		System.out.println("srednia arytmetyczna=" + ((liczbaMax + liczbaMin) / 2));
	}

}
