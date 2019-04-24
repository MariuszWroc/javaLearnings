package advanced.structures;

public class Parent {
	public String publicName;
	Long packageNumber;
	protected Double protectedNumber;
	private Integer privateNumber;
	
	public Parent(String publicName, Long packageNumber, Double protectedNumber, Integer privateNumber) {
		this.publicName = publicName;
		this.packageNumber = packageNumber;
		this.protectedNumber = protectedNumber;
		this.privateNumber = privateNumber;
	}

	public String getPublicName() {
		return publicName;
	}

	public Long getPackageNumber() {
		return packageNumber;
	}

	public Double getProtectedNumber() {
		return protectedNumber;
	}

	public Integer getPrivateNumber() {
		return privateNumber;
	}

	@Override
	public String toString() {
		return "Parent [publicName=" + publicName + ", packageNumber=" + packageNumber + ", protectedNumber="
				+ protectedNumber + ", privateNumber=" + privateNumber + "]";
	}
	
}
