package videoCurriculum;

public class AsterikBox {
	
	public static void main(String[] args) {
		
		printInBox("Hello World");
		printInBox("This is a much longer String!");
		
	}
	
	/*
	 * "Hello"
	 * 
	 * *****************
	 * ***Hello World***
	 * *****************
	 */
	private static void printInBox(String string) {
		int boxLength = string.length() + 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
		System.out.println("***" + string + "***");
		System.out.println(sb.toString());
	}

}
