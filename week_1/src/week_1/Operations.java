package week_1;

public class Operations {
		
	public static void main(String[] args) {
		
		//arithmetic operators + - / * %
		int numberOfChildren = 3;
		
		System.out.println("Number of Children: " + numberOfChildren);
		
		numberOfChildren = 4;
		
		System.out.println("Number of Children: " + numberOfChildren);
		
		numberOfChildren = numberOfChildren + 2;
		
		System.out.println("Number of Children: " + numberOfChildren);
		
		// += is the same as numberOfChilren = numberOfChildren + 2
		// -= *= /= 
		numberOfChildren += 2;
		
		System.out.println("Number of Children: " + numberOfChildren);
		
		// modulus (mod) %
		System.out.println(5 % 2);
		System.out.println(10 % 4);
		System.out.println(10 % 2); //if 0, it is even
		
	}

}
