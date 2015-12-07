package kalkulator;

public class ToNieJestLiczbaException extends KalkulatorException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5731651472860240281L;

	public ToNieJestLiczbaException(String a) {
		super("To " + a + " nie jest liczba.");
	}
}