package patterns.singleton;

public final class ClassicSingleton {
	private static ClassicSingleton instance;
	private static int counter = 0;

	private ClassicSingleton() {
		counter++;
	}

	public static synchronized  ClassicSingleton getInstance() {
		if (instance == null) {
			instance = new ClassicSingleton();
		}
		return instance;
	}
	
	public void methodInSingleton() {
		System.out.println("Invoke classic singleton " + counter);
	}
}
