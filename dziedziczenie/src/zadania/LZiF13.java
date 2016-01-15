package zadania;

import java.util.Scanner;

public class LZiF13 {
	// 13. Napisać funkcję String poprzestawiaj(String tekst, int [] kolejnosc) ,
	// której wynikiem jest łańcuch złożony ze znaków w zmiennej tekst ułożonych wg
	// kolejności podanej w tablicy kolejnosc , tzn. i-ty znak tekstu powinien znaleźć
	// się w wynikowym łańcuchu na pozycji kolejnosc[i] .
	// Przykład, dla poniższego wywołania funkcji:
	// String tekst = "Egzamin";
	// int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
	// System.out.println(poprzestawiaj(tekst, kol));
	// wynikiem powinien być łańcuch:
	// Egmazni
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("napis");
		String str = skaner.nextLine();
		int dlugosc = str.length();
		int[] kol = new int[dlugosc];
		for (int i = 0; i < kol.length; i++) {
			System.out.println("podaj liczbe");
			kol[i] = skaner.nextInt();

		}
		// str="abc"
		// kol={2,1,0}
		char[] tablica = new char[dlugosc];
		for (int i = 0; i < tablica.length; i++) {
			char co = str.charAt(i); // c
			int gdzie = kol[i]; // 0
			tablica[gdzie] = co;// {'c','b','a'}

		}
		String wynik = new String(tablica);
		System.out.println(wynik);
		skaner.close();

	}
	// public static String poprzestawiaj(String tekst, int[] kolejnosc) {
	// }
}
