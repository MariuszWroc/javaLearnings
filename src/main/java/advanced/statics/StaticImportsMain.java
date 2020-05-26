package advanced.statics;

import static advanced.statics.RestaurantNames.KFC;
import static advanced.statics.RestaurantNames.MC_DONALDS;
import static advanced.statics.RestaurantNames.PIZZA_HUT;

import static advanced.statics.RestaurantHelper.add;
import static advanced.statics.RestaurantHelper.showRestaurants;

public class StaticImportsMain {

	public static void main(String[] args) {
		Restaurant mcDonalds = new Restaurant(MC_DONALDS);
		Restaurant kfc = new Restaurant(KFC);
		Restaurant pizzaHut = new Restaurant(PIZZA_HUT);
		
		add(mcDonalds);
		add(kfc);
		add(pizzaHut);
		
		showRestaurants();
	}

}
