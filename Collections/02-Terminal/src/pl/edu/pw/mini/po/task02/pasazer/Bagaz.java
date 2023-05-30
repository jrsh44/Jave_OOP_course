package pl.edu.pw.mini.po.task02.pasazer;

import java.util.Objects;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.task02.przedmioty.Przedmiot;

public abstract class Bagaz {

	protected static Random random = new Random();
	protected static int classId = 0;
	
	protected int Id;
	protected Set<Przedmiot> zawartosc;
	
	public Bagaz() {
		this.Id = Bagaz.classId++;
	}
	
	public Set<Przedmiot> pobierzPrzedmiotyZBagazu(){
		return this.zawartosc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bagaz other = (Bagaz) obj;
		return Id == other.Id;
	}
}
