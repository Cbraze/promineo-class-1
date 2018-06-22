package week_2;

public class SwitchExample {

	public static void main(String[] args) {
		
		char option = 'c';
		
		switch (option) {
			case 'a': {
				System.out.println("option is a");
				break;
			}
			case 'b': {
				System.out.println("options is b");
				break;
			}
			case 'c': {
				System.out.println("option is c");
				break;
			}
			default: {
				System.out.println("option is something other than a, b, or c.");
			}
		}
		
	}

}
