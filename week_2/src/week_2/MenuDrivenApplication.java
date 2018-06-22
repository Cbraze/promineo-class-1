package week_2;

import java.util.Scanner;

public class MenuDrivenApplication {

	public static void main(String[] args) {
		
		int decision = 0;
		String userName = "unknown";
		Scanner sc = new Scanner(System.in);
		
		//the application runs until user picks -1
		while (decision != -1) {
			
			System.out.println("Welcome, " + userName);
			System.out.println("1) Rename User");
			System.out.print("Pick a number between 1 and 10: ");
			decision = sc.nextInt();
			
			if (decision > 10 || decision < -1) {
				System.out.println("Please FOLLOW THE INSTRUCTIONS!");
			} else if (decision == 1) {
				System.out.print("Enter user name: ");
				userName = sc.next();
			}
			
		}
		
		System.out.println("Goodbye!");

	}

}
