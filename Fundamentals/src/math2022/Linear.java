package math2022;

public class Linear extends Function{
	
	private double a;
	private double b;
	
	public Linear(double a, double b, Domain domain) {
		super(domain);
		this.a = a;
		this.b = b;
		
	}
	
	public Linear(String s) {
		super(Domain.R);
		this.getValuesOutOfString(s);
	}
	
	private void getValuesOutOfString(String s) {
		int x = s.indexOf('x');
		
		if(x!=-1) {
			this.a = Double.valueOf(s.substring(0,x).equals("-") ? "-1" : s.substring(0,x));
			this.b = Double.valueOf(s.substring(x+1));
		} else {
			this.b = Double.valueOf(s.substring(x+1));
		}
		System.out.println(this.a+"x"+" + "+this.b);
	}
	
	@Override
	public double calculate(double x) {
		if(this.isInDomain(x)) {
			return a*x+b;
		} else {
			this.handleNotInDomain(x);
			return 0;
		}
		
	}
	@Override
	public double calculateDerivative(double x) {
		if(this.isInDomain(x)) {
			return a;
		} else {
			this.handleNotInDomain(x);
			return 0;
		}
	};
}
