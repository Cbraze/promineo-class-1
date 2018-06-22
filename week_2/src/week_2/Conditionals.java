package week_2;

public class Conditionals {
	
	public static void main(String[] args) {
		
		double moneyInPocket = 5.50;
		double costOfMilk = 5.50;
		int milkQuantity = 5;
		
//		if (costOfMilk < 3 && costOfMilk * 2 <= moneyInPocket) {
//			System.out.println("You can buy two of them!");
//		}
		
		if (costOfMilk < 3) {
			System.out.println("I should buy some milk");
		} else if (costOfMilk < 5) {
			System.out.println("That's expensive, but I really need milk so I'll still buy it");
		} else {
			System.out.println("I really shouldn't buy it.");
		}
		
	}

}
