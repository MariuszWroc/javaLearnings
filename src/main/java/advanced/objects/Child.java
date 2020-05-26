package advanced.objects;

public class Child extends Parent{

	public Child(String publicName, Long packageNumber, Double protectedNumber, Integer privateNumber) {
		super(publicName, packageNumber, protectedNumber, privateNumber);
	}
	
	public void checkValues() {
		String name = super.publicName;
		Long packageNumber = super.packageNumber;
		Double protectedNumber = super.protectedNumber;
		
		System.out.println("Test 1) " + name + " " + packageNumber + " " + protectedNumber);
		
		String nameByGet = super.getPublicName();
		Long packageNumberByGet = super.getPackageNumber();
		Double protectedNumberByGet = super.getProtectedNumber();
		Integer privateNumberByGet = super.getPrivateNumber();
		
		System.out.println("Test 2) " + nameByGet + " " + packageNumberByGet + " " + protectedNumberByGet + " " + privateNumberByGet);
	}
	
}
