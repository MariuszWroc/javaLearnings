package advanced.statics;

public class StaticBlockMain {
	public static void main(String[] args) {
		Tournament tournament = new Tournament();
		InitTournament init = new InitTournament();
		init.populate(tournament);
		System.out.println(tournament.toString());
	}
}
