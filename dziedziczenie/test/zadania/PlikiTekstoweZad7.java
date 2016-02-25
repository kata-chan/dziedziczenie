package zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class PlikiTekstoweZad7 {
	// 7. Napisać program, który dla pliku tekstowego o podanej nazwie wyznaczy „wykres”
	// częstości wystąpień małych liter alfabetu angielskiego. Słupki wykresu mają
	// zostać utworzone ze znaków gwiazdki ’*’, przy czym długość słupka dla najczęściej
	// występującej litery powinna wynosić 50. Dodatkowo dla każdego znaku należy dodatkowo
	// wyświetlić liczbę jego wystąpień.
	// Poniżej umieszczono przykładowy wykres wygenerowany dla tekstu „Adventures
	// of Huckleberry Finn” M. Twaina dostępnego pod adresem:
	// http://www.gutenberg.org/dirs/7/76/76.txt
	// a ************************************* 36581
	// b ******* 7439
	// c ******** 8317
	// d ************************ 23754
	// e ************************************************** 49084
	// f ******** 7914
	// g ********** 10733
	// h ************************** 26338
	// i **************************** 28222
	// j * 1211
	// k ***** 5677
	// l ***************** 17446
	// m ********** 10337
	// n ********************************* 32818
	// o ************************************* 36700
	// p ****** 5971
	// q 189
	// r ******************** 20252
	// s ************************* 25193
	// t ******************************************* 42390
	// u ************** 13954
	// v ** 2944
	// w ************* 13347
	// x 453
	// y ********** 10312
	// z 185
	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku");
		String strona = skaner.nextLine();
		wykres(strona);
		skaner.close();

	}

	public static void wykres(String strona) {

		int[] iloscWystapienLiter = new int['z' - 'a' + 1];

		try {
			URL u = new URL(strona);
			InputStream is = u.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String linia;
			while (true) {
				linia = br.readLine();
				if (linia == null) {
					break;
				}
				for (int i = 0; i < linia.length(); i++) {
					char znak = linia.charAt(i);
					if (znak >= 'a' && znak <= 'z') {
						iloscWystapienLiter[znak - 'a']++;
					}
				}
			}
			for (int i = 0; i < iloscWystapienLiter.length; i++) {
				System.out.print("" + String.valueOf((char) ('a' + i)) + " ");
				String gwiazdka = "";
				for (int j = 0; j < +iloscWystapienLiter[i] / 1000; j++) {
					gwiazdka += "*";
				}
				System.out.print(gwiazdka + " ");
				System.out.println(iloscWystapienLiter[i]);
			}

			br.close();
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private static void iloscWystapienLiter() {
		// TODO Auto-generated method stub

	}
}
