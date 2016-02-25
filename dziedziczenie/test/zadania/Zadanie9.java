package zadania;

import java.util.Scanner;

public class Zadanie9 {
	// 9. Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
	// • oblicza sumę cyfr tej liczby,
	// • stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
	// cyfr nieparzystych.

	public static void main(String[] arg) {

		Scanner konsola = new Scanner(System.in);

		System.out.println("Podaj liczbe calkowita");

		int sumaCN = 0;
		int sumaCP = 0;
		int liczba = konsola.nextInt();
		int iloscCyfrParzystych = 0;
		int iloscCyfrNieparzystych = 0;
		int sumaCyfr = 0;

		while (liczba > 0) {
			int cyfra = liczba % 10;
			if (cyfra % 2 == 0) {
				iloscCyfrParzystych++;
				sumaCP += cyfra;
			} else {
				iloscCyfrNieparzystych++;
				sumaCN += cyfra;
			}
			sumaCyfr = sumaCyfr + cyfra;
			liczba = liczba / 10;

		}
		System.out.println("suma cyfr=" + sumaCyfr);
		System.out.println("ilosc cyfr parzystych=" + iloscCyfrParzystych);
		System.out.println("ilosc cyfr nieparzystych=" + iloscCyfrNieparzystych);
		System.out.println("suma cyfr parzystych=" + sumaCP);
		System.out.println("suma cyfr nieparzystych=" + sumaCN);
		if (iloscCyfrParzystych == 0 || iloscCyfrNieparzystych == 0 || (sumaCN / iloscCyfrNieparzystych) == 0) {
			System.out.println("nie mozna dzielic przez 0");
		} else {
			System.out.println("stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej" +
					"cyfr nieparzystych=" + (sumaCP / iloscCyfrParzystych) / (sumaCN / iloscCyfrNieparzystych));
		}

		konsola.close();
	}
}