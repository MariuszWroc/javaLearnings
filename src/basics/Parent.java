package basics;

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

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public Long getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(Long packageNumber) {
		this.packageNumber = packageNumber;
	}

	public Double getProtectedNumber() {
		return protectedNumber;
	}

	public void setProtectedNumber(Double protectedNumber) {
		this.protectedNumber = protectedNumber;
	}

	public Integer getPrivateNumber() {
		return privateNumber;
	}

	public void setPrivateNumber(Integer privateNumber) {
		this.privateNumber = privateNumber;
	}

	@Override
	public String toString() {
		return "Parent [publicName=" + publicName + ", packageNumber=" + packageNumber + ", protectedNumber="
				+ protectedNumber + ", privateNumber=" + privateNumber + "]";
	}
	
}
