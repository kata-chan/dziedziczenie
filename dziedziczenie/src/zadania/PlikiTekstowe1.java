package zadania;

import java.util.Scanner;

public class PlikiTekstowe1 {
//	1. Napisać funkcję liczZnakiSlowa, która zlicza:
//		• liczbę znaków w pliku,
//		• liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik
//		końca wiersza),
//		• liczbę słów w pliku.
//		Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych
//		podpunktów.

	
	
	
	public static void main(String[] arg) {

		Scanner skaner = new Scanner(System.in);
		System.out.println("podaj wyraz");
		String wyraz = skaner.nextLine();
		skaner.close();
		
		public static int [] liczZnakiSlowa(String wyraz){
			
		
		int suma=0;
		
			int [] tablica= new int [3];
		
		for(int i=0; i<tablica.length;i++){
	if (i==1){
		//int suma = 0;

		char poprzedniZnak = ' ';
		for (int j = 0; j < wyraz.length(); j++) {
			char aktualnyZnak = wyraz.charAt(j);
			if (Character.isWhitespace(poprzedniZnak) && !(Character.isWhitespace(aktualnyZnak))) {
				suma++;
			}
			poprzedniZnak = aktualnyZnak;
		}

	}
	if (i==0){
		

	//int	suma=0;
	
		for(int k=0; k<wyraz.length();k++){
			char litera= wyraz.charAt(k);
			if (litera>='a'&& litera<='z'){
				suma++;
			}
		}
	}
	if (i==2){
		//int suma=0;
		for(int l=0; l<wyraz.length();l++){
			char litera=wyraz.charAt(l);
			if(Character.isWhitespace(litera)){
				suma++;
			}
		}
	}
	return tablica[i]=suma;
		
	}

}
