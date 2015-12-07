package kalkulator;

public class NieMoznaDzielicPrzezZeroException extends KalkulatorException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5722614488974087870L;

	public NieMoznaDzielicPrzezZeroException() {
		super(" nie można podzielić przez zero");
	}
}
