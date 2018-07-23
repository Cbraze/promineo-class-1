package week_5;

public class Entry {

	public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		Player player1 = new Player("Bobby");
		Player player2 = new Player("Sally");
		
		for (int i = 0; i < 7; i++) {
			player1.draw(myDeck);
			player2.draw(myDeck);
		}

		System.out.println(player1.getName());
		System.out.println("------------------------");
		player1.checkHand();
		
		System.out.println(player2.getName());
		System.out.println("------------------------");
		player2.checkHand();
	}

}
