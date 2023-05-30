package kret2021;

import kret2021.Kret.GetunekKreta;

public class Main {

	public static void main(String[] args) {
		Environment env = new Environment(6, 4, 4, 5, GetunekKreta.EUROPAEA);
		env.showEnvironment();
		env.runMole();
		

	}

}
