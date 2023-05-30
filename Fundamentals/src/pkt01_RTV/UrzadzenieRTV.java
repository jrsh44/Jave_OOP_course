package pkt01_RTV;
import java.time.LocalDate;
import java.util.Random;

public abstract class UrzadzenieRTV implements Odbieranie{
	
	protected Random random = new Random();

	final protected LocalDate dataProdukcji;
	static private int numerSeryjny = 0;
	final protected String nazwa;
	protected int iloscWlaczen;
	protected boolean wlaczone;
	
	protected UrzadzenieRTV(){
		this.dataProdukcji = LocalDate.now();
		this.nazwa = createName()+"_"+String.valueOf(UrzadzenieRTV.numerSeryjny);
		this.iloscWlaczen = random.nextInt(3,7);
		this.wlaczone = false;
		UrzadzenieRTV.kolejnaSeria();
	}
	
	private static void kolejnaSeria() {
		UrzadzenieRTV.numerSeryjny++;
	}
	
	private String createName() {
		String n = "";
		for(int i = 0; i<4; i++) {
			n += String.valueOf((char)('A' + random.nextInt(26)));
		}
		return n;
	}
	
	public void wlacz() {
		if(!this.wlaczone) {
			if(this.iloscWlaczen > 0) {
				this.wlaczone = true;
			} else {
				System.out.println("Urzadzenie jest zepsute. Zalecana naprawa :)");
			} 
		}
	}
	
	public void wylacz() {
		if(this.wlaczone) {
			this.wlaczone = false;
			this.iloscWlaczen--;
		}
	}
	
	public void napraw() {
		if(this.iloscWlaczen == 0) {
			this.iloscWlaczen = random.nextInt(3,7);
		} else {
			System.out.println("Urzadzenie nie wymaga naprawy");
		}
	}

}
