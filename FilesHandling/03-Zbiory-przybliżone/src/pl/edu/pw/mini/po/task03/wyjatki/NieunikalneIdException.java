package pl.edu.pw.mini.po.task03.wyjatki;

public class NieunikalneIdException extends Exception {

	public NieunikalneIdException() {
		super("Id pacjentow sa takie same!!");
	}
}
