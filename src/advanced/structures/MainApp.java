package advanced.structures;

import java.util.Arrays;
import java.util.List;

import advanced.objects.Child;
import advanced.objects.ChildOfFinalParent;
import basics.AutoBoxingLesson;

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
		
		Parent parent = new Parent("test parent", 10l, 20.0, 30);
		Child child = new Child("test child", 10l, 20.0, 30);
		child.checkValues();
		
		ChildOfFinalParent child2 = new ChildOfFinalParent("aaa");
		child2.getLastName();
	}
}
