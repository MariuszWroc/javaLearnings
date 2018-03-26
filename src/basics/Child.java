package basics;

public class Child extends Parent{

	public Child(String publicName, Long packageNumber, Double protectedNumber, Integer privateNumber) {
		super(publicName, packageNumber, protectedNumber, privateNumber);
	}
	
	public void checkFields() {
		String name = super.publicName;
		Long packageNumber = super.packageNumber;
		Double number = super.protectedNumber;
		
		System.out.println(name + " " + number + " " + packageNumber);
	}
	
}
