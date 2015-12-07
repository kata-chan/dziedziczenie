package algorytmy;

import org.junit.Assert;
import org.junit.Test;

public class ZliczanieTest {

	@Test
	public void zliczanieTest() {
		Assert.assertEquals(6, Zliczanie.zliczanie(33));
		Assert.assertEquals(9, Zliczanie.zliczanie(99));
		Assert.assertEquals(8, Zliczanie.zliczanie(53));
		Assert.assertEquals(6, Zliczanie.zliczanie(24));
		Assert.assertEquals(2, Zliczanie.zliczanie(11));
		Assert.assertEquals(6, Zliczanie.zliczanie(15));
		Assert.assertEquals(7, Zliczanie.zliczanie(43));
		Assert.assertEquals(5, Zliczanie.zliczanie(77));
		Assert.assertEquals(9, Zliczanie.zliczanie(111111111));
	}

}
