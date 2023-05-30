package pl.edu.pw.mini.po.task03.kebab;

import java.util.Objects;

import pl.edu.pw.mini.po.task03.kebab.skladniki.Mieso;
import pl.edu.pw.mini.po.task03.kebab.skladniki.Rozmiar;

public abstract class Kebab {
	
	protected Rozmiar rozmiar;
	protected Mieso mieso;
	protected int waga;
	protected double cena;
	
	public Kebab(String r, String m, int w, double c) {
		this.cena = c;
		this.waga = w;
		this.rozmiar = Rozmiar.getRozmiar(r);
		this.mieso = Mieso.getMieso(m);
	}
	
	public Rozmiar getRozmiar() {
		return this.rozmiar;
	}
	
	public int getWaga() {
		return this.waga;
	}
	
	public double getCena() {
		return this.cena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cena, mieso, rozmiar, waga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kebab other = (Kebab) obj;
		return Double.doubleToLongBits(cena) == Double.doubleToLongBits(other.cena) && mieso == other.mieso
				&& rozmiar == other.rozmiar && waga == other.waga;
	}
	
	

}
