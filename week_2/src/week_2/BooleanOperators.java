package week_2;

public class BooleanOperators {

	public static void main(String[] args) {
		
		/*
		 * Boolean Operators:
		 * == equality
		 * > greater than
		 * < less than
		 * >= greater than or equal
		 * <= less than or equal
		 * 
		 * && AND, if two boolean expression evaluate to true, the whole expression is true
		 * || OR, if either boolean expression evaluates to true, the whole expression is true
		 */
		
		double moneyInPocket = 0.50;
		double moneyInWifesPocket = 2.50;
		double temperature = 108.01;
		boolean isHotOutside = temperature >= 100;
		boolean willBuyIceCream = isHotOutside && moneyInPocket > 5;
		
		System.out.println("It is hot outside: " + isHotOutside);
		
		System.out.println("I will buy some ice cream: " + willBuyIceCream);
		
		System.out.println("I am getting a candybar: " + (moneyInPocket > 1 || moneyInWifesPocket > 1));
		
		System.out.println("I am getting a candybar: " + (moneyInPocket > 1 && moneyInWifesPocket > 1));	
		
	}

}
