package dziedziczenie;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Czlowiek {
	private Calendar dataUrodzenia;
	private final String imie;
	private int kieszonkowe;

	private ArrayList<String> zainteresowania = new ArrayList<String>();

	public Czlowiek() {
		imie = "ktos";

	}

	public Czlowiek(String imie) {
		this(imie, null);

	}

	public Czlowiek(String imie, Calendar dataUrodzenia) {
		this(imie, dataUrodzenia, new ArrayList<String>());
	}

	public Czlowiek(String i, Calendar dataUrodzenia, ArrayList<String> zainteresowania) {
		imie = i;
		this.dataUrodzenia = dataUrodzenia;
		this.zainteresowania = zainteresowania;

	}

	public void dodajZainteresowanie(String zainteresowanie) {

		zainteresowania.add(zainteresowanie);
	}

	public int setKieszonkowe(int kasa) {
		kieszonkowe = kasa;
		return kieszonkowe;

	}

	public int getKieszonkowe() {
		return kieszonkowe;
	}

	@Override
	public boolean equals(Object other) {
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
	public String toString() {
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
					+ zainteresowania.toString());

		} else {
			System.out.println("nie mam zainteresowan");
		}
	}

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