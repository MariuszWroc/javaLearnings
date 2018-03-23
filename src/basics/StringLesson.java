package basics;

public class StringLesson {

	public static void main(String args []) {
		int firstNumberToCheck = 1;
		int secondNumberToCheck = 2;
		if (firstNumberToCheck == secondNumberToCheck) {
			System.out.println("S¹ rownie");
		} else {
			System.out.println("Nie s¹ sobie równe");
		}

		
		String checkValue = "1";

		if (checkValue == "1") {
		System.out.println("1");
		} else if (checkValue == "2") {
			System.out.println("2");
		} else {
			System.out.println("coœ innego");
		}
		
		String stringMyObject = new String("1");
		if (stringMyObject == "1") {
		System.out.println("1");
		} else {
			System.out.println("coœ innego");
		}
		
		String stringTwo = new String("2");
		if (stringTwo.equals("2")) {
		System.out.println("2");
		} else {
			System.out.println("coœ innego");
		}
		
		String sampleTest = "   aaa";
		char charAt = sampleTest.charAt(2);
		System.out.println(charAt);
		
		int indexOf = sampleTest.indexOf('a');
		System.out.println(indexOf);
		
		String sampleTestStr = sampleTest.concat(" str");
		String sampleTestStr2 = sampleTestStr.concat(" str");
		String sampleTestStr3 = sampleTestStr2.concat("   ");
		
		System.out.println(sampleTestStr3);
		String replaceAllString = sampleTestStr3.replaceAll("str", "ttt");
		System.out.println(replaceAllString);
		
		String[] split = replaceAllString.split(" ");
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {
			System.out.println(i + ", " + split[i]);
		}
		
		replaceAllString.substring(1, 3);
		System.out.println(replaceAllString);
		
		System.out.println(replaceAllString.toUpperCase());
		System.out.println(replaceAllString.toLowerCase());
		System.out.println(replaceAllString.trim());
		
		String immutableString = "Sample text.";
		StringBuilder builder = new StringBuilder(immutableString);
		for (int i =0; i <10; i++) {
			builder.append("\nLoop counter: " + i);
		}
		System.out.println(builder.toString());
		
		StringBuffer buffer = new StringBuffer(replaceAllString);
		for (int i =0; i <10; i++) {
			buffer.append("coœ");
		}
		System.out.println(buffer.toString());
	}
}
