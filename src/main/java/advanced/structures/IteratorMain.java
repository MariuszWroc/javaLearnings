package advanced.structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

	public static void main(String[] args) {
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		fibonacci.add(2);
		fibonacci.add(3);
		fibonacci.add(5);
		fibonacci.add(8);
		
		fibonacci.forEach(x -> System.out.println(x));
		
		MyList myList = new MyList(fibonacci);


		Iterator<Integer> iterator = myList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
