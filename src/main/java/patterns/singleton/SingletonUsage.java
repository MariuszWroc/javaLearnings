package patterns.singleton;

public class SingletonUsage {
	
	private DoubleCheckedSingleton INSTANCE = DoubleCheckedSingleton.getInstance();

	public void useSingleton() {
		INSTANCE.methodInSingleton();
	}

}
