package dziedziczenie;

import java.util.ArrayList;
import java.util.Date;

public abstract class Czlowiek {
	private Date dataUrodzenia;
	private final String imie;

	private ArrayList<String> zainteresowania = new ArrayList<String>();

	public Czlowiek() {
		imie = "ktos";

	}

	public Czlowiek(String imie) {
		this(imie, null);

	}

	public Czlowiek(String imie, Date dataUrodzenia) {
		this(imie, dataUrodzenia, new ArrayList<String>());
	}

	public Czlowiek(String i, Date dataUrodzenia, ArrayList<String> zainteresowania) {
		imie = i;
		this.dataUrodzenia = dataUrodzenia;
		this.zainteresowania = zainteresowania;

	}

	public void dodajZainteresowanie(String zainteresowanie) {

		zainteresowania.add(zainteresowanie);
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

	public Date getDataUrodzenia() {
		return dataUrodzenia;

	}

	public String getImie() {
		return imie;

	}

	public int getWiek() {
		Date aktualnaData = new Date();
		int aktualnyRok = aktualnaData.getYear();
		int rokUrodzenia = dataUrodzenia.getYear();
		int wiek = aktualnyRok - rokUrodzenia;
		return wiek;

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

	public void setDataUrodzenia(Date x) {
		dataUrodzenia = x;
	}

}