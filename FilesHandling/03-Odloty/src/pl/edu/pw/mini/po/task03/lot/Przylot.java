package pl.edu.pw.mini.po.task03.lot;

public class Przylot extends Lot {
	
	protected boolean czyWyladowal;
	protected int nrWyjscia;

	public Przylot(String godzina, String kierunek, String idLotu, String linia, boolean czyWyladowal, int nrWyjscia) {
		super(godzina, kierunek, idLotu, linia);
		this.czyWyladowal = czyWyladowal;
		this.nrWyjscia = nrWyjscia;
	}

	@Override
	public String toString() {
		return "Przylot [czyWyladowal=" + czyWyladowal + ", nrWyjscia=" + nrWyjscia + ", godzina=" + godzina
				+ ", kierunek=" + kierunek + ", idLotu=" + idLotu + ", linia=" + linia + "]";
	}
	
	public boolean getCzyWyladowal() {
		return this.czyWyladowal;
	}

}
