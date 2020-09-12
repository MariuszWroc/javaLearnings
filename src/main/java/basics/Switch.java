package basics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3 };

		for (int i = 0; i < intArray.length; i++) {
			int elementFromArray = intArray[i];
			if (elementFromArray == 1) {
				System.out.println("Wy�wietli�e� pierwszy element");
			} else if (elementFromArray == 2) {
				System.out.println("Wy�wietli�e� drugi element");
			} else {
				System.out.println("Wy�wietli�e� ostatni element");
			}
		}
		
		int i = 0;
		while (i < intArray.length) {
			int elementFromArray = intArray[i];
			if (elementFromArray == 1) {
				System.out.println("Wy�wietli�e� pierwszy element");
			} else if (elementFromArray == 2) {
				System.out.println("Wy�wietli�e� drugi element");
			} else {
				System.out.println("Wy�wietli�e� ostatni element");
			}
			i++;
		}
		
		System.out.println("Wpisz dowoln� liczb�");
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String nextValue = sc.next();
			if (nextValue.equals("1")) {
				System.out.println("Wy�wietli�e� pierwszy element");
			} else if (nextValue.equals("2")) {
				System.out.println("Wy�wietli�e� drugi element");
			} else {
				System.out.println("Teraz nast�pi wyj�cie z programu");
				return;
			}
		}
		sc.close();

		System.out.println("Wpisz dowoln� liczb�");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int nextInt = scanner.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("Wy�wietli�e� " + nextInt);
				break;
			case 2:
				System.out.println("Wy�wietli�e� " + nextInt);
				break;
			default:
				System.out.println("Liczba poza zakresem");
				return;
			}
		}
		sc.close();

	}
}
