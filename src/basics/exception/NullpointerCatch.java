package basics.exception;

import java.util.ArrayList;

public class NullpointerCatch {

	public static void main(String [] args) {
		try {
			ArrayList<String> list = null;
			list.get(0);
		} catch (Exception e) {
			System.out.println("Nullpointer catched");
		}
	}
}
