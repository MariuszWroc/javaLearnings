package basics.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NullpointerCatch {

	public static void main(String [] args) throws IOException {
		try {
			fileFacade();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
			System.exit(0);
			
		}
		StringBuffer name = null;
	}

	private static void fileFacade() throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("c:\\somefile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
			System.out.println("finally");
			file.close();
		}
	}
}
