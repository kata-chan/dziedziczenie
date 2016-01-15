package zadania;

import java.util.Scanner;

public class LZiF6 {
	// 6. Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą
	// zapisaną w postaci łańcucha na liczbę całkowitą typu int. Funkcja powinna
	// przerywać konwersję w momencie napotkania pierwszego znaku nie należącego do
	// zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13.
	// Pozostałe przykłady:
	// 11
	// strToInt("+12") - wynik 12
	// strToInt("0001") - wynik 1
	// strToInt("991-234-23") - wynik 991
	// strToInt("+zonk") - wynik 0
	// strToInt("") - wynik 0
	// strToInt("-12e5") - wynik -12*10^5 = -1200000
	// strToInt("-12e-5") - wynik -12, tylko dodatnie wykładniki są rozpatrywane

	public static void main(String[] args) {
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wstaw tekst");
		String text = skaner.nextLine();
		skaner.close();
		int wynik = strToInt(text);
		System.out.println(wynik);

	}

	public static int strToInt(String text) {
		int indeksKoncaWykladnika = 0;
		int indeksKoncaLiczby = 0;
		boolean isWykladnik = false;
		for (int i = 0; i < text.length(); i++) {
			char znak = text.charAt(i);
			if (znak == 'e' && !isWykladnik) {
				isWykladnik = true;
				continue;
			}
			if (!(znak >= '0' && znak <= '9')) {
				if ((znak != '+' && znak != '-') || i > 0) {
					break;
				}
			}
			if (isWykladnik) {
				indeksKoncaWykladnika = i + 1;
			} else {
				indeksKoncaLiczby = i + 1;
			}
		}
		// 12e32qeee
		// indKLiczby = 2
		// indKWykladnika = 5
		String liczba = text.substring(0, indeksKoncaLiczby);
		int wykladnik = 0;
		if (isWykladnik && indeksKoncaLiczby < indeksKoncaWykladnika) {
			wykladnik = Integer.parseInt(text.substring(indeksKoncaLiczby + 1, indeksKoncaWykladnika));
		}
		return Integer.parseInt(liczba) * (int) Math.pow(10, wykladnik);
	}
}