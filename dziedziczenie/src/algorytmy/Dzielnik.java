package algorytmy;

public class Dzielnik {
	public static int nwd(int a, int b) {
		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	public static void main(String[] args) {

		System.out.println(nwd(6, 12));
	}

}
