package week_2;

public class NestedConditionals {

	public static void main(String[] args) {
		
		int quantityProducts = 50;
		double price = 10.50;
		
		if (quantityProducts > 10) {
			if (price > 8) {
				//short for price = price - 1;
				price -= 1;
			} else {
				price -= .5;
			}
		}
		
//		if (quantityProducts > 10) {
//			if (price > 8) {
//				price -= 1;
//			}
//		}

		//flatten this if statement
		if (quantityProducts > 10 && price > 8) {
			price -= 1;
		}
	}

}
