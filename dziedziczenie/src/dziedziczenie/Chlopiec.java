package dziedziczenie;

public class Chlopiec extends Dziecko {
	public Chlopiec() {

	}

	public Chlopiec(String imie) {
		super(imie);
	}

	@Override
	public void przedstawSie() {
		System.out.println("jestem jeszcze ma�y");
		super.przedstawSie();

	}
}