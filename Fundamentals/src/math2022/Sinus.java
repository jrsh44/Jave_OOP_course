package math2022;

public class Sinus extends Function {

	Sinus(Domain domain) {
		super(domain);
	}

	public double calculate(double x) {
		if(this.isInDomain(x)) {
			return Math.sin(x);
		} else {
			this.handleNotInDomain(x);
			return 0;
		}
		
	}

	@Override
	public double calculateDerivative(double x) {
		if(this.isInDomain(x)) {
			return Math.cos(x);
		} else {
			this.handleNotInDomain(x);
			return 0;
		}
	}

}
