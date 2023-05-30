package math2022;

public class Exponent extends Function{

	public Exponent(Domain domain) {
		super(domain);

	}

	public double calculate(double x) {
		if(this.isInDomain(x)) {
			return Math.exp(x);
		} else {
			this.handleNotInDomain(x);
			return 0;
		}
	}

	@Override
	public double calculateDerivative(double x) {
		return this.calculate(x);
	}

}
