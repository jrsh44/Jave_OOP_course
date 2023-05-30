package grzybobranie2022;

import java.util.Random;

public class Grzybiarz {
	
	private Random random = new Random();
	public Las las;
	
	public Grzybiarz(Las l) {
		this.las = l;
	}
	
	public void konsumujGrzyby() {
		int n = random.nextInt(50+1,100);
		for(int i = 0; i < n; i++) {
			Muchomor m = this.las.zbierzGrzyba();
			if(m != null) {
				m.ugotuj();
				if(zjedz(m)) {
					break;
				}
			}
		}
	}
	
	public void konsumujGrzyby(Las l) {
		int n = random.nextInt(50+1,100);
		for(int i = 0; i < n; i++) {
			Muchomor m = l.zbierzGrzyba();
			if(m != null) {
				m.ugotuj();
				if(zjedz(m)) {
					break;
				}
			}
		}
	}
	
	private boolean zjedz(Muchomor m) {
		if(m.isTrujacy()) {
			System.out.println("Upsss");
			return true;
		} else {
			return false;
		}
	}
	
}
