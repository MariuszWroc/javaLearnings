package patterns.builder;

public class PatternsMain {
	
	public static void main (String [] args) {
		String code = null;
		Long id = null;
		String firstname = null;
		String lastname = null;
		String street = null;
		Integer number = null;
		String city = null;
		BuilderPattern myBuilder = new BuilderPattern
				.Builder(id, firstname, lastname, street, code, number, city)
				.code(code)
				.build();
	}
}
