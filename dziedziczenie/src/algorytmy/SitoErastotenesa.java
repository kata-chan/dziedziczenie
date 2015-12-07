package algorytmy;

public class SitoErastotenesa {
	public static void main(String[] arg) {

		int n = 100;
		boolean[] liczbyPierwsze = new boolean[n];

		for (int i = 2; i < n; i++) {
			liczbyPierwsze[i] = true;
			// System.out.println(liczbyPierwsze[i]);
		}
		int minimalna = 1;
		while (minimalna < Math.sqrt(n)) {
			for (int i = minimalna + 1; i < n; i++) {
				if (liczbyPierwsze[i] == true) {
					minimalna = i;
					break;
				}

			}
			for (int i = 2 * minimalna; i < n; i = i + minimalna) {
				liczbyPierwsze[i] = false;
			}
		}
		for (int i = 2; i < n; i++) {
			if (liczbyPierwsze[i] == true) {
				System.out.println(i);
			}

		}
	}
}