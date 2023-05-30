package pl.edu.pw.mini.po.task03.lot;

import java.util.Arrays;

import pl.edu.pw.mini.po.task03.lot.elementy.Status;

public class Odlot extends Lot {
	
	protected Status status;
	protected int[] checkIn = new int[2];

	public Odlot(String godzina, String kierunek, String idLotu, String linia, String status, int[] checkIn) {
		super(godzina, kierunek, idLotu, linia);
		this.status = Status.getStatus(status);
		this.checkIn = checkIn;
	}

	@Override
	public String toString() {
		return "Odlot [status=" + status + ", checkIn=" + Arrays.toString(checkIn) + ", godzina=" + godzina
				+ ", kierunek=" + kierunek + ", idLotu=" + idLotu + ", linia=" + linia + "]";
	}
	

}
