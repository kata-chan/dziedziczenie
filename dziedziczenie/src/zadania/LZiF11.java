package zadania;

import java.util.Scanner;

public class LZiF11 {
	// 11. Zdefiniować procedurę String strcut(String str, int start, int ile) , któ-
	// ra wycina z podanego łańcucha wszystko co znajduje się w podanym zakresie. Wynikiem
	// funkcji powinien być łańcuch bez znaków znajdujących się na pozycjach
	// od start do start+ile-1 .
	// Przykłady:
	// strcut("Ala ma kota", 4, 3) - wynik to "Ala kota"
	// strcut("Ala ma kota", 0, 4) - wynik to "ma kota"
	// strcut("Ala ma kota", 0, 11) - wynik to ""
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("napis");
		String str = skaner.nextLine();
		System.out.println("start");
		int start = skaner.nextInt();
		System.out.println("ile");
		int ile = skaner.nextInt();
		skaner.close();
		String wynik = strcut(str, start, ile);
		System.out.println(wynik);
	}

	public static String strcut(String str, int start, int ile) {
		return new StringBuffer(str).delete(start, start + ile).toString();
	}

	// chyba by można też użyć metody substring?

}