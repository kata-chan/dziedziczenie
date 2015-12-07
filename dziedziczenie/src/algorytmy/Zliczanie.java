package algorytmy;

public class Zliczanie {

	public static int zliczanie(int x) {
		int liczbaZliczona = 0;
		while (x > 0) {
			liczbaZliczona = liczbaZliczona + x % 10;
			x = x / 10;

		}
		if (liczbaZliczona > 9) {
			liczbaZliczona = zliczanie(liczbaZliczona);

		}

		return liczbaZliczona;
	}
}
