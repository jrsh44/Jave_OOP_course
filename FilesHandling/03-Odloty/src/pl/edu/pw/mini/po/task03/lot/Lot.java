package pl.edu.pw.mini.po.task03.lot;

import java.util.Objects;

public abstract class Lot {
	
	protected String godzina;
	protected String kierunek;
	protected String idLotu;
	protected String linia;
	
	public Lot(String godzina, String kierunek, String idLotu, String linia) {
		this.godzina = godzina;
		this.idLotu = idLotu;
		this.kierunek = kierunek;
		this.linia = linia;
	}
	
	public String getIdLotu() {
		return this.idLotu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLotu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lot other = (Lot) obj;
		return Objects.equals(idLotu, other.idLotu);
	}
	
	

}
