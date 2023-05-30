package pl.edu.pw.mini.po.task03.narzedzia.wyjatki;

public class CheckInException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckInException() {
		super("Bramka poczatkowa jest wieksza od koncowej!!!");
	}
}
