package advanced.generics;

public class RestaurantsMain {

	public static void main(String[] args) {
		Restaurant<Italian, Long> pizzaNapoli = new Restaurant<>();
		//Restaurant<FastFood, Long> kfc  = new Restaurant<>(); // <- błąd, nie zadziała
	}

}
