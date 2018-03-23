package basics;

import java.util.Arrays;
import java.util.List;

public class MainApp {
	public static void main(String args []) {
		AutoBoxingLesson autoBoxing = new AutoBoxingLesson();
		autoBoxing.myMethod(new Integer(10));
		autoBoxing.myMethod(10);
		autoBoxing.myMethod(10, new Integer(20));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		MyList myList = new MyList(list);
		
		for (Integer sample : myList) {
			System.out.println(sample);
		}
	}
}
