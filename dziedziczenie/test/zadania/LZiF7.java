package zadania;

import java.util.Scanner;

public class LZiF7 {
	// 7. Zdefiniować funkcję int strfind(String gdzie, String co) , która szuka łań-
	// cucha co w łańcuchu gdzie i jeżeli go znajdzie, to jej wynikiem jest pozycja,
	// na której ten łańcuch zaczyna się w łańcuchu gdzie . Jeżeli nie udało się znaleźć
	// łańcucha to wtedy wynikiem ma być -1.
	// Przykłady:
	// strfind("Ala ma kota", "ma") - wynik to 4
	// strfind("Ala ma kota", "Ala ma kota") - wynik to 0
	// strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
	// podłańcuchem każdego innego łańcucha
	// strfind("Pies", "jakis napis") - wynik to -1
	// strfind("Ala ma kota", "pies") - wynik to -1
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj gdzie");
		String gdzie = skaner.nextLine();
		System.out.println("podaj co");
		String co = skaner.nextLine();
		skaner.close();
		int wynik = strfind(gdzie, co);
		System.out.println(wynik);
	}

	public static int strfind(String gdzie, String co) {
		int pozycja = gdzie.indexOf(co);
		return pozycja;
	}
}