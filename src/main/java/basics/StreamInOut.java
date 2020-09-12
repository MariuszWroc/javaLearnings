package basics;

import java.util.Scanner;

public class StreamInOut {

	public static class MainClass {
		public static void main(String [] args) {
			StreamInOut in = new StreamInOut();
			in.seeSystemOut("OK");
			in.seeSystemError();
			in.seeCurrentTime();
			in.exitProgram();
		}
	}
	
	public void seeSystemOut(String text) {
		System.out.println("My text is " + text);
	}
	
	public void seeSystemError() {
		System.err.println("Nastapi� b��d w trakcie dzia�ania");
	}
	
	public void seeScanner(String name) {
		Scanner in = new Scanner(System.in);
		if (in.hasNext()) {
			System.out.println("Warto�� przekazana w linii komend " + in.next());
		}
		in.close();
	}
	
	public void seeCurrentTime() {
		long startTime = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum = sum + i;
			// p�tla utworzona po to, aby policzy� d�ugo�� wykonywania si� kodu
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Metoda dzia�a " + (endTime - startTime) + " milisekundy.");
	}
	
	public void exitProgram() {
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Interacja nr " + i);
			if (i == 2) {
				System.out.println("Koniec programu.");
				System.exit(0);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Metoda dzia�a " + (endTime - startTime) + " milisekundy.");
	}

}
