package unknown2019;

public class User {
	protected String firstName, lastName;
	protected int age;
	protected boolean isBlocked = false;
	
	User(String firstName, String lastName, int age){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.blockIfUnderage();
		this.isAdmin();
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void blockUser() {
		this.isBlocked = true;
	}
	
	@Override
	public String toString() {
		return "User(First Name: "+this.firstName+", Last Name: "+this.lastName+", age: "+this.age+")";
	}
	
	public boolean isUnderage() {
		if(this.age < 18) {
			return(true);
		}else {
			return(false);
		}
	}
	
	public void blockIfUnderage() {
		if(this.isUnderage()) {
			this.blockUser();
		}
	}
	
	public boolean isAdmin() {
		return(false);
	}
	

	
}
