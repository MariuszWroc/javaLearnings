package algorithms.recursive;

public class Palindrom {

	public static void main(String[] args) {
		String text = "opipo";
		System.out.println(isPalindrom(text, 0 , text.length()-1));
	}

	private static boolean isPalindrom(String text, int start, int end) {
		if (text.length() == 1) {
			return true;
		} 
		if(text.charAt(start) != text.charAt(end)) {
			return false;
		} 
		
		if (start < end+1) {
			return isPalindrom(text, start+1, end - 1);
		}
		return true;
	}

}
