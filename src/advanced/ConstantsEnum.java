package advanced;

public enum ConstantsEnum {
	OK("ok");
	private final String name;
	
	private ConstantsEnum(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
}
