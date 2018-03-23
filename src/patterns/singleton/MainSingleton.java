package patterns.singleton;

public class MainSingleton {

	public static void main(String [] args) {
		ClassicSingleton.getInstance().methodInSingleton();
		ClassicSingleton.getInstance().methodInSingleton();
		DoubleCheckedSingleton.getInstance().methodInSingleton();
		DoubleCheckedSingleton.getInstance().methodInSingleton();
		EnumSingleton.INSTANCE.methodInSingleton();
		EnumSingleton.INSTANCE.methodInSingleton();
	}
}
