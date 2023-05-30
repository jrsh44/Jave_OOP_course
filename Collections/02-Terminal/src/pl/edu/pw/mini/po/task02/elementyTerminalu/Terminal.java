package pl.edu.pw.mini.po.task02.elementyTerminalu;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.task02.Neon;
import pl.edu.pw.mini.po.task02.pasazer.Pasazer;

public class Terminal<T> {
	
	protected static Random random = new Random();
	
	protected OperatorBramkiBagazowej operatorBramkiBagazowej;
	protected OperatorBramkiBezpieczenstwa operatorBramkiBezpieczenstwa;
	protected Set<Pasazer> pasazerowie = new HashSet<Pasazer>();
	protected T reklama;
	
	public Terminal(T reklama) {
		this.reklama = reklama;
		this.operatorBramkiBagazowej = new OperatorBramkiBagazowej(new BramkaBagazowa());
		this.operatorBramkiBezpieczenstwa= new OperatorBramkiBezpieczenstwa(new BramkaBezpieczenstwa());
		for(int i = 0; i < Terminal.random.nextInt(1, 10); i++) {
			this.pasazerowie.add(new Pasazer());
		}
	}
	
	public void go() {
		for(Pasazer pasazer : this.pasazerowie) {
			this.operatorBramkiBezpieczenstwa.sprawdzPasazera(pasazer);
			this.operatorBramkiBagazowej.pobierzBagaze(pasazer);
		}
	}
	
	public void pokazReklame() {
		System.out.println(this.reklama);
	}

}
