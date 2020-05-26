package algorithms.recursive;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fib(5));
	}

	private static int fib(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1 || i == 2) {
			return 1;
		} else {
			return fib(i-2) + fib(i-1);
		}
		
	}

}
