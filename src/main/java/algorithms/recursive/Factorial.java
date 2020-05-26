package algorithms.recursive;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fac(5));
		System.out.println(fac(1));
		System.out.println(fac(0));
	}

	private static int fac(int x) {
		if (x == 0) {
			return 1;
		} else {
			return fac(x-1)*x;
		}
	}

}
