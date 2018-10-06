package videos;

public class conditionals {
	
	public static void main(String[] args) {
		
		String name = "Tom";
		
		if (name == "Tom") {
			System.out.println("Tom is my best friend");
		}
		
		int age = 13;
		
		if (age >= 16) {
			System.out.println("You can get a driver's license");		
		} else {
			System.out.println("You need to wait " + (16 - age) + " years until you can get a driver's license.");
		}
		
		double priceOfMilk = 1.99;
		
		if (priceOfMilk < 2) {
			System.out.println("Buy 2 gallons of milk");
		} else if (priceOfMilk < 3) {
			System.out.println("Buy 1 gallon of milk");
		} else {
			System.out.println("Not buying any of the super expensive milk!");
		}
		
		char grade = 'x';
		
		switch (grade) {
			case 'a':
				System.out.println("90 - 100");
				break;
			case 'b':
				System.out.println("80 - 89");
				break;
			case 'c':
				System.out.println("70 -79");
				break;
			case 'd':
				System.out.println("60-69");
				break;
			case 'f':
				System.out.println("0 - 59");
				break;
			default:
				System.out.println("Invalid grade.");
		}
		
		if (1 == 1 && 2 == 2) {
			System.out.println("Both are true");
		}
		
		if (1 ==1) {
			System.out.println("At least the first is true.");
			if (2 == 1) {
				System.out.println("Both are true.");
			}
		}
	}
	

}
