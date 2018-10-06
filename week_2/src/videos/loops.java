package videos;

public class loops {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("loop is over.");
		
		int cupsOfFlourNeeded = 4;
		
		for (int i = 0; i < cupsOfFlourNeeded; i++) {
			System.out.println("scoop a cup of flour into the bowl.");
		}
		
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number: " + i);
			}
		}
		
		int i = 11;
		
		while (i < 10) {
			System.out.println("i is less than 10. i = " + i);
			i++;
		}
		
		do {
			System.out.println("Do while: " + i);
		} while (i < 10);
		
	}

}
