package pl.edu.pw.mini.po.task02;

import pl.edu.pw.mini.po.task02.elementyTerminalu.Terminal;

public class Demonstrator {

	public static void main(String[] args) {
		Terminal<Neon> terminal = new Terminal<>(new Neon());
		terminal.go();
		terminal.pokazReklame();
	}

}
