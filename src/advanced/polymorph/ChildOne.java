package advanced.polymorph;

public class ChildOne extends Parent{
	private String name;

	public ChildOne(String parentName, String name) {
		super(parentName);
		this.name = name;
	}

	public void showName() {
		System.out.println("Dziecko nazywa siê " + name);
	}
}
