package advanced.polymorph;

public class Polimorphism {

	public static void main(String args[]) {
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
