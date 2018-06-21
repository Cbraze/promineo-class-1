package week_1;

public class Variables {
	
	//This is a comment, anything after double forward slashes is not compiled as code.
	//Comments are used to allow programmers to make notes in and describing their code.
	
	//main is the entry point into a program, this is where your code starts when you run it.
	public static void main(String[] args) {
		
		//declaring a variable with type, name, assignment operator (=), value, and semicolon.
		int age = 34;
		double accountBalance = 12.76;
		boolean isHotOutside = true;
		char middleInitial = 'C';
		String firstName = "Sam";
		String lastName = "Smith";
		
		//anything you puth in between the parenthesis in System.out.println() will be printed
		//to the console when the program is run/executed.
		System.out.println("Hello World!");
		
		//prints the value in the variable firstName ("Sam") concatenated with an empty space (" ")
		//concatenated with the value in the variable lastName ("Smith") resulting in the 
		//following being printed to the console: Sam Smith
		System.out.println(firstName + " " + lastName);

	}

}
