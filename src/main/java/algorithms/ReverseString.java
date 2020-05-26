package algorithms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String input = "GeeksForGeeks"; 
		  
        char[] charArray = input.toCharArray();
        char[] reverseChars = new char[input.length()];
        int length = charArray.length;
		for (int i = 0; i < length; i++) {
			reverseChars[i] = charArray[length-i];
		}
        
        System.out.println(Arrays.toString(reverseChars));
	}

}
