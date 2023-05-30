package math2022;

public abstract class Function implements Deriverable {
	
	protected Domain domain;
	
	public Function(Domain domain) {
		this.domain = domain;
	}
	
	public abstract double calculate(double x);
	
	protected boolean isInDomain(double x) {
		return this.domain.isInDomain(x);
	}
	
	protected void handleNotInDomain(double x) {
		System.out.println(x+" nie nalezy do "+ this.domain);
	}
	
	public static double calculateSum(Function f1, Function f2, double x) {
		return f1.calculate(x) + f2.calculate(x);
	}
	
	public static double calculateSumDerivative(Function f1, Function f2, double x) {
		return f1.calculateDerivative(x) + f2.calculateDerivative(x);
	}
	
	public static double[] CalculateRowSum(Function[][] funs, double x) {
		double[] ans = new double[funs.length];
			
		for(int i = 0; i < funs.length; i++) {
			if(funs[i] instanceof Function[]) {
				for(Function fun : funs[i]) {
					ans[i] += fun.calculate(x);
				}
			}
		}
		return ans;
	}


}
