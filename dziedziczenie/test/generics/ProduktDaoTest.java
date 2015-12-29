package generics;

import generics.impl.ProduktDaoImpl;
import generics.model.Produkt;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProduktDaoTest {

	ProduktDaoImpl dao;

	@Test
	public void daoTest() {
		// utwórz produkt, ustaw mu pola oraz klucz
		Produkt produkt = new Produkt();
		produkt.setCena(13);
		produkt.setNazwa("Nutella");
		produkt.setKodKreskowy(777777);
		produkt.setWaga(1);

		// zapisz go za pomocą dao
		dao.persist(produkt);
		// sprawdz czy metoda select poprawnie znajduje produkt

		Produkt produkt2 = dao.select(produkt.getKodKreskowy());

		Assert.assertEquals(produkt.getKodKreskowy(), produkt2.getKodKreskowy());
		Assert.assertEquals(produkt.getCena(), produkt2.getCena());
		Assert.assertEquals(produkt.getNazwa(), produkt2.getNazwa());
		Assert.assertEquals(produkt.getWaga(), produkt2.getWaga());
		// sprawdz czy metoda listall zwraca list z jednym elementem, którym jest zapisany produkt
		List<Produkt> lista = dao.listAll();
		Assert.assertEquals(1, lista.size());

		// usuń produkt za pomocą metody z dao
		dao.delete(produkt.getKodKreskowy());
		Assert.assertEquals(0, lista.size());
		// sprawdz czy select nie znajduje produktu
		Assert.assertEquals(null, dao.select(produkt.getKodKreskowy()));
		// sprawdz czy listAll zwraca pusta liste
		Assert.assertEquals(true, dao.listAll().isEmpty());
	}

	@Before
	public void init() {
		// utworz obiekt dao i zapisz go jako skladowa
		dao = new ProduktDaoImpl();

	}
}
