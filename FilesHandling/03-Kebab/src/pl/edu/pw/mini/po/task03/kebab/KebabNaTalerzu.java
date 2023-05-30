package pl.edu.pw.mini.po.task03.kebab;

import java.util.Objects;

import pl.edu.pw.mini.po.task03.kebab.skladniki.Dodatek;

public class KebabNaTalerzu extends Kebab {
	
	protected Dodatek dodatek;
	protected boolean czyNaWynos;

	public KebabNaTalerzu(String r, String d, String m, int w, boolean czyNaWynos, double c) {
		super(r, m, w, c);
		this.dodatek = Dodatek.getDodatek(d);
		this.czyNaWynos = czyNaWynos;
	}

	@Override
	public String toString() {
		return "KebabNaTalerzu [dodatek=" + dodatek + ", czyNaWynos=" + czyNaWynos + ", rozmiar=" + rozmiar + ", mieso="
				+ mieso + ", waga=" + waga + ", cena=" + cena + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(czyNaWynos, dodatek);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KebabNaTalerzu other = (KebabNaTalerzu) obj;
		return czyNaWynos == other.czyNaWynos && dodatek == other.dodatek;
	}

}
