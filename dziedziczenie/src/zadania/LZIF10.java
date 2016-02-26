package zadania;

import java.util.Scanner;

public class LZIF10 {
	// 10. Zdefiniować funkcję int strFindAndCount(String gdzie, String co) , która
	// zlicza wystąpienia łańcucha co w łańcuchu gdzie . Jej wynikiem jest wyznaczona
	// liczba wystąpień. Jeżeli nie udało się znaleźć łańcucha, to wtedy wynikiem
	// jest, oczywiście, 0.
	// Przykłady:
	// strFindAndCount("Ala ma kota", "ma") - wynik to 1
	// strFindAndCount("mama ma kota", "ma") - wynik to 3
	// strFindAndCount("Ala mmaa ma kota", "ma") - wynik to 2
	// strFindAndCount("Ala ma kota", "Asia") - wynik to 0
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj gdzie");
		String gdzie = skaner.nextLine();
		System.out.println("podaj co");
		String co = skaner.nextLine();
		skaner.close();
		int wynik = strFindAndCount(gdzie, co);
		System.out.println(wynik);
	}

	public static int strFindAndCount(String gdzie, String co) {

		int ile = 0;

		int pozycja = gdzie.indexOf(co);

		while (pozycja >= 0) {
			++ile;
			pozycja = gdzie.indexOf(co, pozycja + 1);
		}
		return ile;
	}
}
