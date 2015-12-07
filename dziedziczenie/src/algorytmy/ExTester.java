package algorytmy;

class MojEx extends Exception {
}

public class ExTester {
	public static void main(String[] args) {
		String test = args[0];

		try {
			System.out.print("p");
			zaryzykuj(test);
			System.out.print("i");
		} catch (MojEx e) {
			System.out.print("a");

		} finally {
			System.out.print("n");
			System.out.print("a");
		}
	}

	static void zaryzykuj(String t) throws MojEx {
		System.out.print("i");
		if ("tak".equals(t)) {
			System.out.print("j");
		}
		throw new MojEx();
	}

}
