package dziedziczenie;

public abstract class Dziecko extends Czlowiek {
	public static final String DOMYSLNE_IMIE_DZIECKA = "jezyna";

	public Dziecko() {
		super(DOMYSLNE_IMIE_DZIECKA);
	}

	public Dziecko(String imie) {
		super(imie);
	}
}
