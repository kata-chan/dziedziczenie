package zadania;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlikiTekstowe3 {
	// 3. Napisać funkcję public static void sumujIZapisz(String nazwaPliku) , któ-
	// ra odczytuje plik o podanej nazwie zawierający liczby całkowite (po jednej w
	// wierszu). Funkcja ma za zadanie odczytać i zsumować wszystkie liczby z pliku,
	// a następnie dopisać na końcu pliku wyznaczoną sumę powiększoną o 1. Ponowne
	// uruchomienia funkcji będą skutkowały dopisywaniem kolejnych wierszy. Jeżeli
	// plik nie istnieje to ma zostać utworzony – suma dla pustego pliku wyniesie 0, a
	// więc należy dopisać wiersz zawierający 1

	public static void main(String[] args) throws IOException {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku");
		String nazwaPliku = skaner.nextLine();
		sumujIZapisz(nazwaPliku);
		skaner.close();
	}

	public static void sumujIZapisz(String nazwaPliku) throws IOException {

		// File plik = new File(nazwaPliku);
		FileReader fileReader = new FileReader(nazwaPliku);
		BufferedReader reader = new BufferedReader(fileReader);
		FileWriter zapis = new FileWriter(nazwaPliku);
		int suma = 0;
		int liczba = 0;
		while (true) {
			String linijka = reader.readLine();
			if (linijka == null) {
				break;
			}
			for (int i = 0; i < linijka.length(); i++) {
				char znak = linijka.charAt(i);
				if (znak >= '0' && znak <= '9') {
					liczba = Integer.valueOf("" + znak);

				}
				suma += liczba;
			}
			zapis.write(suma + 1);
		}
		zapis.close();
		reader.close();
	}
}
