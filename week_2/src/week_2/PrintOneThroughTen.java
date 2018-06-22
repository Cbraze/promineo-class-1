package week_2;

public class PrintOneThroughTen {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//	(variable declaration; condition; post increment)
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("hello " + i);
			i++;
		}
		
		int j = 0;
		do {
			System.out.println("does something");
			j++;
		} while(j < 10);
	}

}
