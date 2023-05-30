package pl.edu.pw.mini.po.task02.przedmioty;

import java.util.Random;

public class PrzedmiotNielegalny extends Przedmiot {

	protected static Random random = new Random();
	
	protected int masa;
	
	public PrzedmiotNielegalny() {
		this.masa = PrzedmiotNielegalny.random.nextInt(5, 28+1);
	}
	
	@Override
	public int getStopienNielegalnosci() {
		return this.masa * 10;
	}

}
