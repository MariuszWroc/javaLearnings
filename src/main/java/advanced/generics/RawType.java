package advanced.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawType {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add(new Employee("Mariusz", 22));
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

	}

}
