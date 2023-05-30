package pl.edu.pw.mini.po.task03.kebab;

import java.util.Objects;

public class KebabWCiescie extends Kebab {
	
	protected boolean czyGruby;

	public KebabWCiescie(String r, boolean czyGruby, String m, int w, double c) {
		super(r, m, w, c);
		this.czyGruby = czyGruby;
	}

	@Override
	public String toString() {
		return "KebabWCiescie [czyGruby=" + czyGruby + ", rozmiar=" + rozmiar + ", mieso=" + mieso + ", waga=" + waga
				+ ", cena=" + cena + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(czyGruby);
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
		KebabWCiescie other = (KebabWCiescie) obj;
		return czyGruby == other.czyGruby;
	}

}
