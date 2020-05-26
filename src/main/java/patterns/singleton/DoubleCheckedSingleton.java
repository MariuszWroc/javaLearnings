package patterns.singleton;

public final class DoubleCheckedSingleton {
	private static volatile DoubleCheckedSingleton instance;
	private static int counter = 0;

	private DoubleCheckedSingleton() {
		counter++;
	}

	public static DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}
	
	public void methodInSingleton() {
		System.out.println("Invoke double checked singleton " + counter);
	}
}
