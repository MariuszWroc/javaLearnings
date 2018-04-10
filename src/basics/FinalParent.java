package basics;

public class FinalParent {
	private String lastName;
	
	public FinalParent(String lastName) {
		this.lastName = lastName;
	}
	
	public final String getLastName() {
		return lastName;
	}
	
}
