package dziedziczenie;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Czlowiek {
	private Calendar dataUrodzenia;
	private final String imie;
	private int kieszonkowe;

	private ArrayList<String> zainteresowania = new ArrayList<String>();

	public Czlowiek() {
		imie = "ktos"; // jezeli nie podasz imienia to automatycznie je przypisuje, ponieważ zmienna finale musi miec
						// przypisaną
		// wartośc albo w konstruktorze albo w deklaracji.

	}

	public Czlowiek(String imie) {
		this(imie, null);// wywołuje konstruktor czlowiek z takimi parametrami jakie posiada

	}

	public Czlowiek(String imie, Calendar dataUrodzenia) {
		this(imie, dataUrodzenia, new ArrayList<String>());// dodaje pusta arrayListe i wywołuje kolejny konstruktor
	}

	public Czlowiek(String i, Calendar dataUrodzenia, ArrayList<String> zainteresowania) {
		imie = i;
		this.dataUrodzenia = dataUrodzenia;
		this.zainteresowania = zainteresowania;

	}

	public void dodajZainteresowanie(String zainteresowanie) {

		zainteresowania.add(zainteresowanie);
	}

	public void setKieszonkowe(int kasa) {// metody set nigdy nic nie zwracają
		kieszonkowe = kasa;

	}

	public int getKieszonkowe() {
		return kieszonkowe;
	}

	@Override
	// przeslonienięcie metody z klasy bazowej Object
	public boolean equals(Object other) {//
		if (other != null && other instanceof Czlowiek) {
			Czlowiek otherCzlowiek = (Czlowiek) other;
			if ((imie).equals(otherCzlowiek.getImie()) && (dataUrodzenia.equals(otherCzlowiek.getDataUrodzenia()))) {
				return true;
			}

		}
		return false;
	}

	public Calendar getDataUrodzenia() {
		return dataUrodzenia;

	}

	public String getImie() {
		return imie;

	}

	public int getWiek() {
		Calendar aktualnaData = Calendar.getInstance();
		int aktualnyRok = aktualnaData.get(Calendar.YEAR);
		int rokUrodzenia = dataUrodzenia.get(Calendar.YEAR);
		int wiek = aktualnyRok - rokUrodzenia;
		return wiek;

	}

	@Override
	// przesloniecie metody z klasy object
	public String toString() {// np.przy testach nie wychodzi upsdziu tylko imie
		return imie;
	}

	public ArrayList<String> getZainteresowania() {
		return zainteresowania;
	}

	public void przedstawSie() {

		System.out.println("mam na imie " + getImie() + " mam lat " + getWiek());
		if (zainteresowania.size() > 0) {
			// (!zainteresowania.isEmpty()) {
			System.out.println("mam " + zainteresowania.size() + " zainteresowania oto one"
					+ zainteresowania.toString());// wypisuje wszystkie zainteresowania

		} else {
			System.out.println("nie mam zainteresowan");
		}
	}

	// walidacja - sprawdzanie danych wejsciowych
	public void setDataUrodzenia(Calendar x) throws DataUrodzinException {
		if (x.after(Calendar.getInstance())) {
			throw new DataUrodzinException();
		}
		Calendar data1900 = Calendar.getInstance();
		data1900.set(1900, 0, 12);
		if (x.before(data1900)) {
			throw new DataUrodzinException();
		}
		dataUrodzenia = x;
	}
}