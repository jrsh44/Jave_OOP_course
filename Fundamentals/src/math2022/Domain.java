package math2022;

public enum Domain {
	R(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY){
		@Override
		public String toString() {
			return"("+Double.NEGATIVE_INFINITY+", "+Double.POSITIVE_INFINITY+")";
		}
	},
	RPLUS(0.0, Double.POSITIVE_INFINITY){
		@Override
		public String toString() {
			return"("+0+", "+Double.POSITIVE_INFINITY+")";
		}
	},
	RMINUS(Double.NEGATIVE_INFINITY, 0.0){
		@Override
		public String toString() {
			return"("+Double.NEGATIVE_INFINITY+", "+0+")";
		}
	};
	
	private final Double poczatek;
	private final Double koniec;
	
	
	Domain(Double x, Double y){
		this.poczatek = x;
		this.koniec = y;
	}
	
	public boolean isInDomain(double x) {
		return this.poczatek <= x && x <= this.koniec;
	}
}

