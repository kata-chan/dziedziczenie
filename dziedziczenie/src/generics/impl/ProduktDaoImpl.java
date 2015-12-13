package generics.impl;

import generics.IDao;
import generics.model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class ProduktDaoImpl implements IDao<Produkt, Integer> {

	List<Produkt> produkty = new ArrayList<Produkt>();

	@Override
	public void delete(Integer id) {
		// for (Produkt produkt : produkty) {
		// if (id.equals(produkt.getId())) {
		// }
		// }
		Produkt zmetodyselect = select(id);
		if (zmetodyselect != null) {
			produkty.remove(zmetodyselect);

		}

	}

	@Override
	public List<Produkt> listAll() {
		return produkty;
	}

	@Override
	public void persist(Produkt entity) {
		produkty.add(entity);
	}

	@Override
	public Produkt select(Integer id) {
		for (Produkt produkt : produkty) {
			if (id.equals(produkt.getId())) {
				return produkt;
			}
		}
		return null;
	}
}