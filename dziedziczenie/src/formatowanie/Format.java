package formatowanie;

public class Format {

	public static String podajWysokoscZarobkow(double kasa, String imie) {
		return String.format("%s zarabia %.2f zł.", imie, kasa);

	}

	public static String numerTelefonuFormat(int numer) {
		return String.format("telefon %,d", numer);
	}
}
