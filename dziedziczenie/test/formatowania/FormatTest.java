package formatowania;

import org.junit.Assert;
import org.junit.Test;

import formatowanie.Format;

public class FormatTest {

	@Test
	public void podajWysokoscZarobkowTest() {
		double wysokoscZarobkow = 257332.5163;
		double wysokoscZarobkowZosi = 156.18;
		Assert.assertEquals("Mikołaj zarabia 257332,52 zł.", Format.podajWysokoscZarobkow(wysokoscZarobkow, "Mikołaj"));
		Assert.assertEquals("Zosia zarabia 156,18 zł.", Format.podajWysokoscZarobkow(wysokoscZarobkowZosi, "Zosia"));
	}

	@Test
	public void NumerTelefonuFormatTest() {
		int telefon = 123456789;
		Assert.assertEquals("telefon 123 456 789", Format.numerTelefonuFormat(telefon));
	}
}