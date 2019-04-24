package advanced.structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListLesson {
	
	
	public static void main(String [] args) {
		List<String> strings = new ArrayList<>();
		strings.add("a");
		strings.size();
		strings.remove("a");
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(0);
		
		Collections.shuffle(ints);
		Collections.sort(ints);
		
		System.out.println(ints);
	}
}
