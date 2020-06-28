package patterns.builder;

public class PatternsMain {
	
	public static void main (String [] args) {
		BuilderPattern myBuilder = new BuilderPattern
				.Builder(1L, "Anna", "Kowalski")
				.code("53-400")
				.city("Wroc³aw")
				.build();
		
		System.out.println(myBuilder);
	}
}
