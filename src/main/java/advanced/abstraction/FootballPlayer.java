package advanced.abstraction;

public class FootballPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Playing football..");
	}

	@Override
	public void score() {
		System.out.println("Scoring goals..");
	}

}
