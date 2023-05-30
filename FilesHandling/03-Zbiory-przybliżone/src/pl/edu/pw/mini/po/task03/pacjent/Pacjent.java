package pl.edu.pw.mini.po.task03.pacjent;

import java.util.Objects;

public abstract class Pacjent {
	
	protected final int id;
	protected int wiek;
	protected double temperatura;
	protected boolean czyKaszel;
	protected boolean czyCovid;
	
	public Pacjent(int id, int wiek, double temperatura, boolean czyKaszel, boolean czyCovid) {
		this.id = id;
		this.wiek = wiek;
		this.temperatura =temperatura;
		this.czyKaszel = czyKaszel;
		this.czyCovid = czyCovid;
	}
	
	public double getTemperatura() {
		return this.temperatura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacjent other = (Pacjent) obj;
		return id == other.id;
	}
	

}
