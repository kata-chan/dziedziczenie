package zadania;

import java.util.Scanner;

public class LZiF9 {
	// 9. Napisać funkcję String[] podzielNaSlowa(String tekst) , która dzieli podany
	// tekst na słowa i zapisuje je w tablicy. Wynikiem funkcji jest tablica zawierające
	// kolejno słowa z tekstu. Za słowo przyjmujemy każdy ciąg znaków niezawierający
	// białego znaku.
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj wyraz");
		String tekst = skaner.nextLine();
		skaner.close();
		String[] wynik = podzielNaSlowa(tekst);
		for (String slowo : wynik) {
			System.out.println(slowo);
		}

	}

	public static String[] podzielNaSlowa(String tekst) {

		String[] slowa = tekst.split(" ");

		return slowa;
	}

}
