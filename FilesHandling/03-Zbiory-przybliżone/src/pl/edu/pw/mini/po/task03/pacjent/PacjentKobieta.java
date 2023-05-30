package pl.edu.pw.mini.po.task03.pacjent;

public class PacjentKobieta extends Pacjent {

	public String nazwiskoRodowe;
	
	public PacjentKobieta(int id, int wiek, double temperatura, boolean czyKaszel, String nazwiskoRodowe, boolean czyCovid) {
		super(id, wiek, temperatura, czyKaszel, czyCovid);
		this.nazwiskoRodowe = nazwiskoRodowe;
	}

	@Override
	public String toString() {
		return "PacjentKobieta [nazwiskoRodowe=" + nazwiskoRodowe + ", wiek=" + wiek + ", temperatura=" + temperatura
				+ ", czyKaszel=" + czyKaszel + ", czyCovid=" + czyCovid + "]";
	}

}
