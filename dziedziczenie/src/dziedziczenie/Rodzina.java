package dziedziczenie;

import java.util.ArrayList;

public class Rodzina {

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
		int iloscChlopcow = 0;
		for (Dziecko dziecko : dzieci) {
			if (dziecko instanceof Chlopiec) {
				iloscChlopcow++;
			}
		}
		return iloscChlopcow;
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
