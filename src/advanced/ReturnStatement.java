package advanced;

import java.util.concurrent.atomic.AtomicInteger;

public class ReturnStatement {
	private static int [] myArray = {5,10,15,20,25};
	private static int j;

	public static void main(String[] args) {
		try {
			view();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void view() {
		System.out.println("--- Post field --");

		j = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(postIncrementationField());
		}

		System.out.println("--- Post --");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(postIncrementation(i));
		}

		System.out.println("--- Normal field --");
		j = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[j]);
		}

		System.out.println("--- Normal --");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		System.out.println("--- Pre field --");
		j = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(preIncrementationField());
		}

		System.out.println("--- Pre --");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(preIncrementation(i));
		}

		System.out.println("--- IncrementAndGet --");
		j = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(preIncrementAndGetAtomic(i));
		}

		System.out.println("--- GetAndIncrement --");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(preGetAndIncrementAtomic(i));
		}
	}

	private static int preIncrementAndGetAtomic(int i) {
		AtomicInteger atomicInteger = new AtomicInteger(i);
		return myArray[atomicInteger.incrementAndGet()];
}
	
	private static int preGetAndIncrementAtomic(int i) {
		AtomicInteger atomicInteger = new AtomicInteger(i);
		return myArray[atomicInteger.getAndIncrement()];
}

	private static int preIncrementation(int i) {
			return myArray[++i];
	}

	private static int postIncrementation(int i) {
		return myArray[i++];
	}
	
	private static int postIncrementationField() {
		return myArray[j++];
	}
	
	private static int preIncrementationField() {
		return myArray[++j];
	}
}
