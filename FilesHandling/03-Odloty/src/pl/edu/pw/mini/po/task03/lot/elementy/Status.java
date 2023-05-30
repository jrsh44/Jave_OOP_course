package pl.edu.pw.mini.po.task03.lot.elementy;

public enum Status {
	STARTED,
	BOARDING,
	CANCELED;
	
	public static Status getStatus(String status) {
		switch(status) {
		case("started"):
			return Status.STARTED;
		case("boarding"):
			return Status.BOARDING;
		case("canceled"):
			return Status.CANCELED;
		default:
			return null;
		}
	}

}
