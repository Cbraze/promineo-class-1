package week_3;

import java.util.Scanner;

public class Equality {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String selection = s.next();
		
		if (selection.equals("Nick")) {
			System.out.println("Hello!");
		} else {
			System.out.println(".....");
		}
	}

}
