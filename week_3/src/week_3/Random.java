package week_3;

public class Random {
	
	public static void main(String[] args) {
		int i = 0;
		while(i != 6) {
			i = (int) (Math.random() * 7);
			
			System.out.println(i);
		}
	}

}
