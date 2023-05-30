package pkt01_RTV;

public class Main {

	public static void main(String[] args) {
//		Radio r1 = new Radio(119);
//		Radio r2 = new Radio(1241);
//		System.out.println(r1);
//		System.out.println(r2);
		
		UrzadzenieRTV[] all = {new Radio(67),
							new TelewizorCRT(17,74,Kolor.KOLOROWY),
							new TelewizorPlaski(33, 24, RodzajSygnalu.ANALOGOWY, Matryca.LCD)
							};
		
		for(UrzadzenieRTV i : all) {
			if(i instanceof TelewizorCRT){
				i.wlacz();
			} else if(i instanceof TelewizorPlaski){
				i.wlacz();
			}
			System.out.println(i);
		}
		
	}
}
