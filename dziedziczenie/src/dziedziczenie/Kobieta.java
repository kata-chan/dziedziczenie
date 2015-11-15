package dziedziczenie;

public class Kobieta extends Czlowiek {
	public Kobieta(String imie) {
		super(imie);
	}

	@Override
	public int getWiek() {
		return (super.getWiek() - 5);
	}

}