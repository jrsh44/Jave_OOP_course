package pl.edu.pw.mini.po.task02.przedmioty;

public class Kielbasa extends PrzedmiotNielegalny {
	
	public Kielbasa() {
		this.masa = PrzedmiotNielegalny.random.nextInt(5, 28+1);

	}
	
	@Override
	public int getStopienNielegalnosci() {
		return this.masa * 5;
	}

}
