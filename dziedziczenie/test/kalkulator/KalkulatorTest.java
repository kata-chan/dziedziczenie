package kalkulator;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {
	@Test
	public void kalkulatorDodawanieTest() throws KalkulatorException {
		Assert.assertEquals(9.5, Kalkulator.wykonujDzialanie("5.5+4"), 0.01);
		Assert.assertEquals(126., Kalkulator.wykonujDzialanie("16.+110."), 0.01);
		Assert.assertEquals(77777., Kalkulator.wykonujDzialanie("77776+1"), 0);
	}

	@Test
	public void kalkulatorMnozenieTest() throws KalkulatorException {
		Assert.assertEquals(12.0, Kalkulator.wykonujDzialanie("3*4"), 0.01);
		Assert.assertEquals(32.0, Kalkulator.wykonujDzialanie("8*4"), 0.01);
		Assert.assertEquals(0.0, Kalkulator.wykonujDzialanie("7*0"), 0.01);
	}

	@Test
	public void kalkulatorDzielenieTest() throws KalkulatorException {

		Assert.assertEquals(4.0, Kalkulator.wykonujDzialanie("16/4"), 0.01);
		Assert.assertEquals(8.0, Kalkulator.wykonujDzialanie("72/9"), 0.01);

	}

	@Test
	public void kalkulatorWyjatekDzielenia() throws KalkulatorException {
		try {
			Kalkulator.wykonujDzialanie("99/0");
			Assert.fail("Nie mozna dzielic przez zero");
		} catch (NieMoznaDzielicPrzezZeroException ex) {

		}
	}

	@Test
	public void kalkulatorWyjatekToNieJestLiczba() throws KalkulatorException {
		try {
			Kalkulator.wykonujDzialanie("krowa+byk");
			Assert.fail("To nie jest liczba");
		} catch (ToNieJestLiczbaException ex) {

		}
	}

	@Test(expected = NieprawidloweDzialanieException.class)
	public void kalkulatorWyjatekBrakZnaku() throws KalkulatorException {
		// try {
		Kalkulator.wykonujDzialanie("mieso");
		// Assert.fail("to nie jest znak dzialania");
		// } catch (NieprawidloweDzialanieException ex) {
		// }
	}

	@Test
	public void kalkulatorOdejmowanieTest3() throws KalkulatorException {

		Assert.assertEquals(12.0, Kalkulator.wykonujDzialanie("16-4"), 0.01);
		Assert.assertEquals(60.0, Kalkulator.wykonujDzialanie("72-12"), 0.01);

	}
}