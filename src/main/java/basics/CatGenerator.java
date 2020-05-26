package basics;

import java.util.Random;

public class CatGenerator {

    public static Cat[] getCats(int catsNumberInArray) {
	Cat[] catArray = new Cat[catsNumberInArray];
	for (int i = 0; i < catArray.length; i++) {
	    catArray[i] = randomCat();
	}
	return catArray;
    }

    public static Cat randomCat() {
	Cat randomCat = new Cat();
	randomCat.setName(randomName());
	randomCat.setRace(randomBreed());
	randomCat.setYear(randomYear());
	return randomCat;
    }

    private static String randomBreed() {
	return CatBreed.randomBreed().name();
    }

    private static int randomYear() {
	int maxLifeExpectancy = 20;
	int minLifeExpectancy = 1;
	return new Random().nextInt(maxLifeExpectancy) + minLifeExpectancy;
    }

    private static String randomName() {
	return CatName.randomName().toString();
    }

    private enum CatName {
	Ginger, Eiffel, Nikon;

	private static CatName randomName() {
	    return values()[new Random().nextInt(CatName.values().length)];
	}
    }

    private enum CatBreed {
	Ragdoll, Persian, Abyssinian;

	private static CatBreed randomBreed() {
	    return values()[new Random().nextInt(CatBreed.values().length)];
	}
    }
}
