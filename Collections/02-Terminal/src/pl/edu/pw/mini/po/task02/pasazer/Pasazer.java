package pl.edu.pw.mini.po.task02.pasazer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Pasazer {

	protected static Random random = new Random();
	
	protected Bilet bilet;
	protected Set<BagazGlowny> bagazeGlowne = new TreeSet<BagazGlowny>(new BagazGlownyComparator());
	protected List<BagazPodreczny> bagazePodreczne = new LinkedList<BagazPodreczny>();
	
	public Pasazer() {
		this.bilet = new Bilet();
		for(int i = 0; i < Pasazer.random.nextInt(2,3+1); i++) {
			this.bagazeGlowne.add(new BagazGlowny());
		}
		for(int i = 0; i < Pasazer.random.nextInt(1,2+1); i++) {
			this.bagazePodreczne.add(new BagazPodreczny());
		}
	}
	
	public Set<BagazGlowny> oddajBagazeGlowne(){
		Set<BagazGlowny> tmp = new TreeSet<BagazGlowny>(new BagazGlownyComparator());
		tmp.addAll(this.bagazeGlowne);
		this.bagazeGlowne.clear();
		return tmp;
	}
	
	public List<BagazPodreczny> getBagazePodreczne() {
		return this.bagazePodreczne;
	}
	
	public void usunBagazPodreczny(BagazPodreczny bagaz) {
		this.bagazePodreczne.remove(bagaz);
	}
	
	public Bilet pokazBilet() {
		return this.bilet;
	}

}
