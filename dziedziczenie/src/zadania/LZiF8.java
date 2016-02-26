package zadania;

import java.util.Scanner;

public class LZiF8 {
	// 8. Napisać funkcję int wordCount(String text) , której wynikiem jest liczba wszystkich
	// słów występujących w podanym jako parametr tekście. Do sprawdzania, czy
	// dany znak tekstu jest „białym znakiem” można zastosować metodę
	// Character.isWhitespace
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj wyraz");
		String wyraz = skaner.nextLine();
		skaner.close();
		int wynik = wordCount(wyraz);
		System.out.println(wynik);
	}

	public static int wordCount(String wyraz) {
		int suma = 0;

		char poprzedniZnak = ' ';
		for (int i = 0; i < wyraz.length(); i++) {
			char aktualnyZnak = wyraz.charAt(i);
			if (Character.isWhitespace(poprzedniZnak) && !(Character.isWhitespace(aktualnyZnak))) {
				suma++;
			}
			poprzedniZnak = aktualnyZnak;
		}
		return suma;
	}
}