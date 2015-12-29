package generics.model;

import generics.IEntity;

public class Produkt implements IEntity<Integer> {

	private int cena;

	private int waga;
	private String nazwa;
	private int kodKreskowy;

	public int getCena() {
		return cena;
	}

	@Override
	public Integer getId() {
		return kodKreskowy;
	}

	public int getKodKreskowy() {
		return kodKreskowy;
	}

	public String getNazwa() {
		return nazwa;
	}

	public int getWaga() {
		return waga;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public void setKodKreskowy(int kodKreskowy) {
		this.kodKreskowy = kodKreskowy;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setWaga(int waga) {
		this.waga = waga;
	}

}
