package algorithms.recursive;

public class StribgCopy {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "geeksforgeeks";
		copy(s1.toCharArray(), s2.toCharArray());
	}

	private static char[] copy(char [] s1, char [] s2) {
		if (s1 == null || s1.length == 0) {
			return s2;
		} else if (s2 == null || s2.length == 0) {
			return s1;
		} else {
			for (int i = 0; i < s2.length; i++) {
				
			}
		}
		return s2;
	}

}
