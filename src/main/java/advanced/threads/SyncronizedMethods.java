package advanced.threads;

public class SyncronizedMethods {
	public synchronized void methodA() {
		System.out.println("methodA");
		methodB();
	}

	public synchronized void methodB() {
		System.out.println("methodB");
	}
}
