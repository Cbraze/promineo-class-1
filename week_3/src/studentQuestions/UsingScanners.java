package studentQuestions;

import java.util.Scanner;

public class UsingScanners {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		

		int option = 0;

		while (option != -1) {
			System.out.println("Print some stuff");

			option = scanner.nextInt();

			if (option == 1) {
				methodOne();
			} else if (option == 2) {
				methodTwo();
			} else if (option == 3) {
				methodThree();
			}
		}
	}

	public static void methodOne() {
		
	}

	public static void methodTwo() {

	}

	public static void methodThree() {

	}

}
