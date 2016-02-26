package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class LZiF14 {
	// 14. Napisać funkcję boolean czyAnagram(String t1, String t2) , która sprawdza,
	// czy łańcuch t2 jest anagramem tekstu t1 , czyli czy składa się z tych
	// samych znaków, ale ustawionych niekoniecznie w tej samej kolejności
	// Uwaga, należy sprawdzać jedynie małe i duże litery alfabetu angielskiego, jednak
	// bez względu na ich wielkość, tzn. zarówno małe ’a’ jak i duże ’A’ liczone są tak
	// samo. Pozostałe znaki nie są sprawdzane, a więc nie mają wpływu na to, czy
	// słowo będzie uznane za anagram innego.
	// Przykładowo, dla poniższego fragmentu programu:
	// System.out.println(czyAnagram("kolej", "olejk"));
	// System.out.println(czyAnagram("kolej", "kole"));
	// System.out.println(czyAnagram("kolej", "K O L E J"));
	// System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
	// na ekranie powinno zostać wyświetlone:
	// true
	// false
	// true
	// true

	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("napis");
		String t1 = skaner.nextLine();
		System.out.println("napis");
		String t2 = skaner.nextLine();

		boolean wynik = czyAnagram(t1, t2);
		System.out.println(wynik);
		skaner.close();
	}

	public static boolean czyAnagram(String t1, String t2) {
		if (t1.length() != t2.length()) {
			return false;
		}
		t1 = t1.toLowerCase();
		t2 = t2.toLowerCase();
		char[] a1 = t1.toCharArray();
		char[] a2 = t2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		String b1 = new String(a1);
		String b2 = new String(a2);
		return b1.equals(b2);
	}

	public static boolean czyAnagram2(String t1, String t2) {
		if (t1.length() != t2.length()) {
			return false;
		}
		t1 = t1.toLowerCase();
		t2 = t2.toLowerCase();
		return false;
	}
}
