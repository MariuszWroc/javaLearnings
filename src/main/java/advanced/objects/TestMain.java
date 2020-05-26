package advanced.objects;

public class TestMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal anim = (Animal) dog;
		anim.eat();
		
		Cat cat = new Cat();
		 
		teach(dog);
		teach(cat);
		
		if (anim instanceof Cat) {
		    Cat catAnim = (Cat) anim;
		    catAnim.meow();
		} else if (anim instanceof Dog) {
		    Dog dogAnim = (Dog) anim;
		    dogAnim.bark();
		}
	}
	
	public static void teach(Animal anim) {
        anim.move();
        anim.eat();
    }

}
