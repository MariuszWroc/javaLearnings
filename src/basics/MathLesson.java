package basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathLesson {

	private static int absoluteValue() {
		
		BigInteger one = new BigInteger("1");
		BigInteger ten = BigInteger.TEN;
		BigInteger onethousand = BigInteger.valueOf(1000);
		
		BigDecimal decimal = BigDecimal.valueOf(10.5);
		
		System.out.println("one " + one + ", ten " + ten + ", one thousand " + onethousand + ", decimal " + decimal);
		return 0;
	}
	
	
	private static class MathMain {
		public static void main(String [] args) {
			absoluteValue();
			System.out.println(Math.abs(-10));
			System.out.println(Math.log(10));
			System.out.println(Math.pow(2, 3));
			System.out.println(Math.round(10.567));
			System.out.println(Math.sqrt(16));
			System.out.println(Math.random());
		}
	}
}
