package basics;

import java.util.ArrayList;

public class RefLesson {
	
	public static void main(String [] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ArrayList raws = ints;
		ArrayList<String> strings = raws;
		System.out.println(strings);
		strings.forEach(x -> System.out.println(x));	
		
		final byte a = 100;
		final byte b = 120;
		byte c = (byte) (a + b);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("1)");
		list.add(1);
		list.forEach(x -> System.out.println(x + ","));
		System.out.println("end");
		add(list);
		System.out.println("4)");
		list.forEach(x -> System.out.println(x + ","));
		System.out.println("end");
	}
	
	 public static void add(ArrayList<Integer> list) {
		 System.out.println("2)");
		 list.add(2);
		 list.forEach(x -> System.out.println(x + ","));
		 System.out.println("end");
		 list = new ArrayList<>();
		 System.out.println("3)");
		 list.add(3);
		 list.forEach(x -> System.out.println(x + ","));
		 System.out.println("end");
	 }

}
