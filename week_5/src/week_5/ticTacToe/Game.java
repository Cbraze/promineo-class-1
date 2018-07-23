package week_5.ticTacToe;

import java.util.Scanner;

public class Game {
	
	private Board board;
	private Player player1;
	private Player player2;
	private Player turn;
	private Scanner scanner;
	private Player winner;
	
	public Game(Board board, Player player1, Player player2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		scanner = new Scanner(System.in);
		this.turn = player1;
	}
	
	public void start() {
		while(winner == null) {
			move();
			System.out.println(board.toString());
		}
		System.out.println("Player " + winner.getToken() + " is the WINNER! :D");
	}
	
	private boolean checkForWinner() {
		Character grid[][] = board.getGrid();
		return (grid[0][0] != null && grid[0][0] == (grid[0][1]) && grid[0][0] == (grid[0][2])) ||
				(grid[1][0] != null && grid[1][0] == (grid[1][1]) && grid[1][0] == (grid[1][2])) ||
				(grid[2][0] != null && grid[2][0] == (grid[2][1]) && grid[2][0] == (grid[2][2])) ||
				(grid[0][0] != null && grid[0][0] == (grid[1][0]) && grid[0][0] == (grid[2][0])) ||
				(grid[0][1] != null && grid[0][1] == (grid[1][1]) && grid[0][1] == (grid[2][1])) ||
				(grid[0][2] != null && grid[0][2] == (grid[1][2]) && grid[0][2] == (grid[2][2])) ||
				(grid[0][0] != null && grid[0][0] == (grid[1][1]) && grid[0][0] == (grid[2][2])) ||
				(grid[0][2] != null && grid[0][2]  == (grid[1][1]) && grid[0][2] == (grid[2][0]));
	}
	
	private void move() {
		System.out.println("Player " + turn.getToken() + "'s turn.");
		System.out.print("Enter x: ");
		int x = scanner.nextInt();
		System.out.print("Enter y: ");
		int y = scanner.nextInt();
		if (board.placeCharacter(turn.getToken(), x, y)) {
			if (checkForWinner()) {
				winner = turn;
			}
			switchTurn();
		} else {
			System.out.println("Please choose an open spot.");
		}
	}
	
	private void switchTurn() {
		turn = turn == player1 ? player2 : player1;
	}

}
