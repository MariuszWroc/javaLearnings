package basics.lesson17;

public class StringFormatSample {

    public static void main(String[] args) {
	Cat cat = new Cat("Emma", "Persian", 10, 100.5, 'F');

	String sampleText = String.format(
		"The name of my cat is %s and it race is %s. It sex is %c and it is %d years old. \nI bought him for the price %f",
		cat.getName(), cat.getRace(), cat.getSex(), cat.getAge(), cat.getValue());
	System.out.println(sampleText);

    }

}
