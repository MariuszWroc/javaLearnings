package advanced;

public class SimpleEnum {
	public enum CounterEnum implements SomeInterface{
		FIRST, SECOND, THIRD;
		
		protected int some;
	}
	
	public interface SomeInterface {
		
	}
	
	public enum CounterEnum2 {
		FIRST, SECOND, THIRD;
	}

	public static void main(String[] args) {

		for (CounterEnum item : CounterEnum.values()) {
			checkButtonValue(item.toString());
		}
	}

	private static void checkButtonValue(String clickedButton) {
		if (clickedButton.equals("FIRST")) {
			System.out.println("OK");
		} else {
			System.out.println("WRONG");
		}
	}
}
