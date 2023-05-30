package pl.edu.pw.mini.po.task03.pacjent;

public class PacjentMezczyzna extends Pacjent {
	
	protected boolean czyBylWWojsku;

	public PacjentMezczyzna(int id, int wiek, double temperatura, boolean czyKaszel, boolean czyBylWWojsku, boolean czyCovid) {
		super(id, wiek, temperatura, czyKaszel, czyCovid);
		this.czyBylWWojsku = czyBylWWojsku;
	}

	@Override
	public String toString() {
		return "PacjentMezczyzna [czyBylWWojsku=" + czyBylWWojsku + ", wiek=" + wiek + ", temperatura=" + temperatura
				+ ", czyKaszel=" + czyKaszel + ", czyCovid=" + czyCovid + "]";
	}

}
