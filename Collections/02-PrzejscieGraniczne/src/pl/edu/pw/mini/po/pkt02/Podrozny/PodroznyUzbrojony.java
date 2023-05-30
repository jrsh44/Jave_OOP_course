package pl.edu.pw.mini.po.pkt02.Podrozny;

public abstract class PodroznyUzbrojony extends Podrozny{

	protected Boolean czyUzbrojony;
	
	public PodroznyUzbrojony() {
		super(Podrozny.random.nextInt(35,75+1));
		this.czyUzbrojony = this.randUzbrojony();
	}
	
	private boolean randUzbrojony() {
		if(Podrozny.random.nextInt(1,2+1) == 1) {
			return(true);
		} else {
			return(false);
		}
	}

}
