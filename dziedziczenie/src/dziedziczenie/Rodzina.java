package dziedziczenie;

import java.util.ArrayList;

public class Rodzina {
	// private static final boolean after.dzieci.get(1) = false;
	Mezczyzna tata;
	Kobieta mama;
	ArrayList<Dziecko> dzieci = new ArrayList<Dziecko>();

	public boolean dodajDziecko(Dziecko d) {
		if (dzieci.contains(d)) {
			return false;
		} else {
			dzieci.add(d);
			return true;
		}
	}

	public int getWiekRodziny() {
		int suma = 0;
		suma += mama.getWiek();
		suma += tata.getWiek();
		for (Dziecko dziecko : dzieci) {
			suma += dziecko.getWiek();
		}
		return suma;
	}

	public Dziecko najstarszeDziecko() {
		if (dzieci.isEmpty()) {
			return null;

		}
		Dziecko najstarszeDziecko = dzieci.get(0);
		for (Dziecko jakiekolwiek : dzieci) {
			if (jakiekolwiek.getDataUrodzenia().before(najstarszeDziecko.getDataUrodzenia())) {

				najstarszeDziecko = jakiekolwiek;
			}
		}
		return najstarszeDziecko;
	}

	public Dziecko najmlodszeDziecko() {
		Dziecko najmlodszeDziecko = dzieci.get(0);
		for (Dziecko jakiekolwiek : dzieci) {
			if (jakiekolwiek.getDataUrodzenia().after(najmlodszeDziecko.getDataUrodzenia())) {

				najmlodszeDziecko = jakiekolwiek;
			}
		}
		return najmlodszeDziecko;

	}

	public ArrayList<Dziecko> getDzieci() {
		return dzieci;
	}

	public Kobieta getMama() {
		return mama;

	}

	public Mezczyzna getTata() {
		return tata;

	}

	public boolean hasDzieci() {
		return dzieci.size() > 0;

	}

	public int iloscChlopcow() {

		int iloscChlocpow = 0;
		for (Dziecko dziecko : dzieci) {
			if (dziecko instanceof Chlopiec) {

				iloscChlocpow++;
			}

		}
		return iloscChlocpow;
	}

	public int iloscDziewczynek() {
		int iloscDziewczynek = 0;
		for (Dziecko dziecko : dzieci) {
			if (dziecko instanceof Dziewczynka) {
				iloscDziewczynek++;
			}
		}
		return iloscDziewczynek;
	}

	public void setMama(Kobieta m) {
		mama = m;
	}

	public void setTata(Mezczyzna t) {

		tata = t;
	}

	public void usunDziecko(Dziewczynka d) {
		dzieci.remove(d);
	}

}
