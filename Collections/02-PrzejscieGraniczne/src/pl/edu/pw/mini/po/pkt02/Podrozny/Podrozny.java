package pl.edu.pw.mini.po.pkt02.Podrozny;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.pkt02.Towar.Towar;
import pl.edu.pw.mini.po.pkt02.Towar.TrefnyTowar;

public abstract class Podrozny {
	
	protected static int classId = 0;
	protected static Random random = new Random();
	
	protected int unikalneId;
	protected int wiek;
	protected Set<Towar> towary = new LinkedHashSet<>();

	
	public Podrozny(int wiek) {
		this.unikalneId = Podrozny.classId;
		Podrozny.classId++;
		this.wiek = wiek;
	}
	
	protected void getTowar(int minimum, int maximum, double procNaTrefny) {
		for(int i = 0; i < Podrozny.random.nextInt(minimum,maximum+1); i++) {
			if(Podrozny.random.nextDouble() < procNaTrefny) {
				this.towary.add(new TrefnyTowar());
			} else {
				this.towary.add(new Towar());
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(unikalneId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podrozny other = (Podrozny) obj;
		return unikalneId == other.unikalneId;
	}
	
}
