package kalkulator;

public class Kalkulator {

	public static double wykonujDzialanie(String wd) throws KalkulatorException {

		if (!(wd.contains("+") || wd.contains("-") || wd.contains("/") || wd.contains("*"))) {
			throw new NieprawidloweDzialanieException(wd);
		}
		int index = -1;
		if (wd.contains("+")) {
			index = wd.indexOf("+");
		}
		if (wd.contains("*")) {
			index = wd.indexOf("*");
		}
		if (wd.contains("/")) {
			index = wd.indexOf("/");
		}
		if (wd.contains("-")) {
			index = wd.indexOf("-");
		}

		String pierwszaLiczba = wd.substring(0, index);
		int dlugoscNapisu = wd.length();
		String drugaLiczba = wd.substring(index + 1, dlugoscNapisu);
		double l1;
		try {
			l1 = Double.parseDouble(pierwszaLiczba);
		} catch (NumberFormatException ex) {
			throw new ToNieJestLiczbaException(pierwszaLiczba);
		}
		double l2;
		try {
			l2 = Double.parseDouble(drugaLiczba);
		} catch (NumberFormatException ex) {
			throw new ToNieJestLiczbaException(drugaLiczba);

		}
		if (wd.contains("+")) {
			double suma = l1 + l2;
			return suma;
		}
		if (wd.contains("*")) {
			double iloczyn = l1 * l2;
			return iloczyn;
		}
		if (wd.contains("/")) {
			if (l2 == 0) {
				throw new NieMoznaDzielicPrzezZeroException();
			}
			double iloraz = l1 / l2;
			return iloraz;

		}
		if (wd.contains("-")) {
			double roznica = l1 - l2;

			return roznica;

		}
		return 0.0;
	}
}
