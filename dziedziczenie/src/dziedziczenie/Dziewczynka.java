package dziedziczenie;

public class Dziewczynka extends Dziecko {
	public Dziewczynka(String imie) {
		super(imie);
	}

	public Dziewczynka() {

	}

	@Override
	public void przedstawSie() {
		System.out.println("jestem jeszcze mala");
		super.przedstawSie();

	}
}
