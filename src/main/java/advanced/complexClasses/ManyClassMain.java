package advanced.complexClasses;

public class ManyClassMain {

	public static void main(String[] args) {
		Container container = new Container();
		AnotherContainer anotherContainer = new AnotherContainer("my container");
		anotherContainer.getName();
		container.write();
	}

}
