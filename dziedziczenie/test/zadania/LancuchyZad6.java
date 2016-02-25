package zadania;

import java.util.Scanner;

public class LancuchyZad6 {
	// 6. Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
	// szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
	// monoalfabetycznego.
	// Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, o którą przesunięty
	// jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
	// przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
	// tj. ’a’ – ’z’ (26 znaków) oraz spacji.
	// Przykład 1.
	// Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
	// Podaj przesunięcie: 2
	// Zaszyfrowany tekst: cdtcmcfcdtcb
	// Przykład 2.
	// Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
	// Podaj przesunięcie: -2
	// Zaszyfrowany tekst: abrakadabraz
	//
	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("wpisz haslo");
		String slowo = skaner.nextLine();
		System.out.println("podaj przesuniecie");
		int przesuniecie = skaner.nextInt();
		StringBuffer szyfr = new StringBuffer();
		skaner.close();
		for (int i = 0; i < slowo.length(); i++) {
			char znak = slowo.charAt(i);
			if (znak >= 'a' && znak <= 'z') {
				char c = (char) (znak + przesuniecie);
				while (c < 'a') {
					c += 'z' - 'a' + 1;
				}
				while (c > 'z') {
					c -= 'z' - 'a' + 1;
				}

				szyfr.append(c);
			}
		}
		System.out.println(szyfr);
	}
}
