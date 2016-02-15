package projekt;

public class Pracownik {

	private String imie;
	private String nazwisko;
	private char plec;
	private int nrDzialu;
	private float place;
	private int wiek;
	private int dzieci;
	private boolean stanCywilny;

	public Pracownik() {

	}

	public Pracownik(String imie, String nazwisko, char plec) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;

	}

	public int getDzieci() {
		return dzieci;
	}

	public String getImie() {
		return imie;

	}

	public String getNazwisko() {
		return nazwisko;
	}

	public int getNr_dzialu() {
		return nrDzialu;
	}

	public float getPlace() {
		return place;
	}

	public char getPlec() {
		return plec;
	}

	public boolean getStanCywilny() {
		return stanCywilny;
	}

	public int getWiek() {
		return wiek;
	}

	public void obliczaniePodwyzki(int procent) {
		int zaStanCywilny = 0;
		int zaDzieci = 0;
		if (stanCywilny == true) {
			zaStanCywilny = 3;
		}
		if (dzieci > 0) {
			zaDzieci = (dzieci * 2);
		}
		int suma = zaDzieci + zaStanCywilny + procent;

		place = place + (place * (suma / 100.f));
	}

	public boolean pensjaPowWart(float pensja) {
		if (place > pensja) {
			return true;
		} else {
			return false;
		}
	}

	public void setDzieci(int dzieci) {
		this.dzieci = dzieci;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public void setNrdzialu(int nr_dzialu) {
		this.nrDzialu = nr_dzialu;
	}

	public void setPlace(float place) {
		this.place = place;
	}

	public void setPlec(char plec) {
		this.plec = plec;
	}

	public void setStanCywilny(boolean stan_cywilny) {
		this.stanCywilny = stan_cywilny;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public void wyswietlanieOkrojone() {
		System.out.println(imie + " " + nazwisko + " " + place);

	}

	public void wyswietlanieSpecjalne() {
		String imieBig = imie.toUpperCase();
		String nazwiskoBig = nazwisko.toUpperCase();
		System.out.println(imieBig + " " + nazwiskoBig);
	}

	public void wyswietlDaneOPracowniku() {
		System.out.println(imie + " " + nazwisko + " " + plec + " " + nrDzialu + " " + place + " " + wiek + " " + dzieci + " " + stanCywilny);

	}
}