package unknown2019;

public class Administrator extends User{

	Administrator(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	
	@Override
	public boolean isAdmin() {
		return(true);
	}
	
	@Override
	public void blockUser() {
		System.out.println("You cannot block an admin ;)");
	}
	
	@Override
	public String toString() {
		return "User(STATUS -> ADMIN, First Name: "+this.firstName+", Last Name: "+this.lastName+", age: "+this.age+")";
	}

}
