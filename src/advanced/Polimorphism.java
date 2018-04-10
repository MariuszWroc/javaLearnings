package advanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Polimorphism {

	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		Parent father = new Parent("Adam");
		ChildOne doughter = new ChildOne("Adam", "Ewa");
		ChildTwo son = new ChildTwo("Adam", "Marek");
		
		if (father instanceof Parent) {
			father.showName();
		}
		doughter.showName();
		son.showName();
		son.showParentName();
		
		Parent doughterFromFather = new ChildOne("Adam", "Ewa");
		doughterFromFather.showName();
		
		Parent sonFromFather = new ChildTwo("Adam", "Marek");
		sonFromFather.showName();
		
		ChildOne notAllowed = (ChildOne) new Parent("Adam"); 
		

		notAllowed.showName();
		
	}
}
