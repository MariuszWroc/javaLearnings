package advanced;

public class ConstantsEnum {
	public enum MyEnum {
		OK("ok");
		private final String name;
		
		private MyEnum(String name) {
			this.name= name;
		}
		
		public String getName() {
			return name;
		}
	}
	
	public static void main(String [] args) {
		System.out.println(MyEnum.OK.getName());
		System.out.println(MyEnum.OK);
		MyEnum[] values = MyEnum.values();
		for (MyEnum myEnum : values) {
			System.out.println(myEnum.getName());
		}
	}
}