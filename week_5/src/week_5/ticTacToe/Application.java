package week_5.ticTacToe;

public class Application {

	public static void main(String[] args) {
		/*
		 * Board
		 * Player
		 * Game
		 */
		
		Board board = new Board();
		Player x = new Player('X');
		Player o = new Player('O');
		Game game = new Game(board, x, o);
		
		game.start();

	}

}
