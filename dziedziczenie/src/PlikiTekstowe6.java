import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlikiTekstowe6 {
	// 6. Napisać funkcję, której zadaniem jest odczytanie danych tabelarycznych z pliku
	// tekstowego, a następnie zapisanie ich do nowego pliku w postaci kodu HTML.
	// Przykład:
	// Wejście:
	// "Waga" "Wzrost" "BMI" "Nadwaga"
	// 70 1,8 21,6 "NIE"
	// 67 1,77 21,39 "NIE"
	// 85 1,7 29,41 "TAK"
	// 100 1,92 27,13 "TAK"
	// Wynik:
	// <html><body>
	// <table>
	// <tr><td>"Waga"</td><td>"Wzrost"</td><td>"BMI"</td><td>"Nadwaga"
	// </td></tr>
	// <tr><td>70</td><td>1,8</td><td>21,6</td><td>"NIE"
	// </td></tr>
	// <tr><td>67</td><td>1,77</td><td>21,39</td><td>"NIE"
	// </td></tr>
	// <tr><td>85</td><td>1,7</td><td>29,41</td><td>"TAK"
	// </td></tr>
	// <tr><td>100</td><td>1,92</td><td>27,13</td><td>"TAK"</td></tr>
	// </table>
	// </body></html>

	public static void main(String[] args) throws IOException {
		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku");
		String nazwaPliku = skaner.nextLine();
		odczytDanych(nazwaPliku);
		skaner.close();

	}

	public static void odczytDanych(String nazwaPliku) throws IOException {

		File plik = new File(nazwaPliku);
		FileReader filereader = new FileReader(nazwaPliku);
		BufferedReader buffer = new BufferedReader(filereader);
		String nowy = nazwaPliku + ".html";
		FileWriter zapis = new FileWriter(nowy);
		zapis.write("<html><body>\n");
		zapis.write("<table>\n");
		while (true) {
			String linijka = buffer.readLine();
			if (linijka == null) {
				break;
			}
			String[] tablicaSlow = linijka.split(" ");
			int wielkoscTablicy = tablicaSlow.length;
			for (int i = 0; i < tablicaSlow.length; i++) {

				if (i == 0) {
					zapis.write("<tr><td>" + tablicaSlow[0] + "</td>");
				}
				if (i > 0 && i < wielkoscTablicy - 1) {
					zapis.write("<td>" + tablicaSlow[i] + "</td>");
				}
				if (i == wielkoscTablicy - 1) {
					zapis.write("<td>" + tablicaSlow[wielkoscTablicy - 1] + "</td></tr>\n");
				}

			}
		}
		zapis.write("</table>\n");
		zapis.write("</body></html>");
		zapis.close();
		buffer.close();
	}
}
