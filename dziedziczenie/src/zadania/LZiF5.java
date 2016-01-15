package zadania;

import java.util.Scanner;

public class LZiF5 {
	// 5. Zdefiniować funkcję boolean startsWith(String str1, String str2) , która
	// sprawdza, czy łańcuch str2 jest prefiksem łańcucha str1 .
	// Przykłady:
	// startsWith("Alibaba", "Ali") - wynik true, ponieważ wyraz
	// "Alibaba" zaczyna się wyrazem "Ali".
	// startsWith("Alibaba", "Alibaba") - wynik true, ponieważ wyraz jest
	// zawsze swoim prefiksem.
	// startsWith("Kot", "Pies") - wynik false, ponieważ wyraz "Pies"
	// nie jest prefiksem wyrazu "Kot"

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wstaw tekst");
		String text = skaner.nextLine();
		System.out.println("sprawdz prefiks");
		String prefiks = skaner.nextLine();
		skaner.close();
		boolean wynik = startWith(text, prefiks);
		System.out.println(wynik);
	}

	public static boolean startWith(String text, String prefiks) {
		return text.startsWith(prefiks);
	}
}
