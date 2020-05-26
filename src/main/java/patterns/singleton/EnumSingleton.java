package patterns.singleton;

public enum EnumSingleton {
	INSTANCE;
	private int counter = 0;
	
	private EnumSingleton() {
		counter++;
	}
	
	public void methodInSingleton() {
		System.out.println("Invoke enum singleton " + counter);
	}
}
