package pl.edu.pw.mini.po.pkt02.Podrozny;

public class Turysta extends Podrozny{

	public Turysta() {
		super(Podrozny.random.nextInt(14, 60+1));
		this.getTowar(10, 20, 0.1);
	}

}
