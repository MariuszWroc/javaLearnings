package advanced.objects;

public class ChildOfFinalParent extends FinalParent{

	public ChildOfFinalParent(String _lastName) {
		super(_lastName);
		super.getLastName();
	}
	

}
