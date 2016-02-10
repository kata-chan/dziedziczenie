package zadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PlikiTekstowe5 {
	// 5. Napisać funkcję emerytura(String nazwaPliku), która wczyta z pliku o podanej
	// nazwie dane pracowników zapisane w kolejnych wierszach w następujący sposób:
	// Imię Nazwisko Płeć Wiek
	// Przykład:
	// Tomasz Nowak M 45
	// Marta Ziobro K 42
	// Jan Kowalski M 27
	// Ewelina Tusk K 59
	// Następnie funkcja dla każdego pracownika powinna wyznaczyć ile lat pozostało
	// do jego emerytury. Wyniki należy zapisać w następujący sposób:
	// Nazwisko Imię ”Lata do emerytury”
	// Przykład:
	// Nowak Tomasz 20
	// Kowalski Jan 38
	// Wyniki dla kobiet należy zapisać w pliku o nazwie ”kobiety.txt”, natomiast wyniki
	// dla mężczyzn należy zapisać w pliku ”mezczyzni.txt”.
	public static void main(String[] arg) throws IOException {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj nazwę pliku");
		String nazwaPliku = skaner.nextLine();
		emerytura(nazwaPliku);
		skaner.close();

	}

	public static void emerytura(String nazwaPliku) throws IOException {

		String plec = " ";
		String imie = " ";
		String nazwisko = " ";
		int lata = 0;
		String lataDoEmerytury = "";
		String wiek = " ";
		String kobieta = "K";
		String mezczyzna = "M";
		File plik = new File(nazwaPliku);
		FileReader fileReader = new FileReader(nazwaPliku);
		BufferedReader reader = new BufferedReader(fileReader);
		File kobiety = new File("kobiety.txt");
		FileWriter kzapis = new FileWriter(kobiety);
		File mezczyzni = new File("mezczyzni.txt");
		FileWriter mzapis = new FileWriter(mezczyzni);
		String[] tablicaPracownikow = new String[4];
		while (true) {

			String linijka = reader.readLine();
			if (linijka == null) {
				break;
			}
			tablicaPracownikow = linijka.split(" ");
			imie = tablicaPracownikow[0];
			nazwisko = tablicaPracownikow[1];
			plec = tablicaPracownikow[2];
			wiek = tablicaPracownikow[3];

			int wiekPracownika = Integer.parseInt(wiek);
			if (plec.equals(kobieta)) {
				lata = 60 - wiekPracownika;
				lataDoEmerytury = "" + lata;
				kzapis.write(imie + " ");
				kzapis.write(nazwisko + " ");
				kzapis.write(lataDoEmerytury + "\n");
			}
			if (plec.equals(mezczyzna)) {
				lata = 65 - wiekPracownika;
				lataDoEmerytury = "" + lata;
				mzapis.write(imie + " ");
				mzapis.write(nazwisko + " ");
				mzapis.write(lataDoEmerytury + "\n");
			}

		}
		mzapis.close();
		kzapis.close();
	}
}