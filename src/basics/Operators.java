package basics;

public class Operators {

	public static void main(String[] args) {
		String testVariable = "some text";
		System.out.println(checkValue(testVariable));
		int result = (testVariable.equals("some text")) ? 0 : 1;
		System.out.println(result);

		int sum=1;
		
		sum+=1;
		int myIntFromDouble = (int) 10.2;
		
		int x = 1;

		if (x == 0 && printInfo()) {
			System.out.println("Operator logiczny zadzia�a�");
		}

		if (x == 0 & printInfo()) {
			System.out.println("Operator bitowy zadzia�a�");
		}
	}

	private static boolean printInfo() {
		System.out.println("Metoda si� wykona�a");
		return true;
	}

	private static int checkValue(String testVariable) {
		if (testVariable.equals("some text")) {
			return 0;
		} else {
			return 1;
		}
	}
}
