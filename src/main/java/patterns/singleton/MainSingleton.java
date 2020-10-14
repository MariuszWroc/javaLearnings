package patterns.singleton;

public class MainSingleton {
	static ClassicSingleton instance = ClassicSingleton.getInstance();
	
	public static void main(String [] args) {
		SingletonUsage singletonUsage = new SingletonUsage();
		singletonUsage.useSingleton();
		
		instance.methodInSingleton();
		instance.methodInSingleton();
		DoubleCheckedSingleton.getInstance().methodInSingleton();
		DoubleCheckedSingleton.getInstance().methodInSingleton();
		EnumSingleton.INSTANCE.methodInSingleton();
		EnumSingleton.INSTANCE.methodInSingleton();
	}
}
