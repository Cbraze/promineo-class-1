package week_3;

import java.util.Scanner;

public class RefactorWithMethods {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int decision = 0;
		String userName = "unknown";
		
		System.out.println("Welcome, " + userName);
		
		printMenu();
		
		while (decision != -1) {
			
			decision = sc.nextInt();
			
			if (decision > 10 || decision < -1) {
				promptForObedience();
			} else if (decision == 1) {
				userName = getUserName();
			}
			
		}
		
		System.out.println("Goodbye!");

	}
	
	public static void printMenu() {
		System.out.println("1) Rename User");
		System.out.println("2) Do Something");
		System.out.println("3) Do Something else");
		System.out.print("Pick a number between 1 and 10: ");
	}
	
	public static String getUserName() {
		System.out.print("Enter user name: ");
		return sc.next();
	}
	
	public static void promptForObedience() {
		System.out.println("Please FOLLOW THE INSTRUCTIONS!");
	}

}
