package kalkulator;

public class NieprawidloweDzialanieException extends KalkulatorException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6614992921913957312L;

	public NieprawidloweDzialanieException(String msg) {
		super("To " + msg + " Nie jest prawidłowe działanie");

	}

}
