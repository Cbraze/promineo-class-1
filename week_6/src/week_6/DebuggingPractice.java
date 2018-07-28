package week_6;

public class DebuggingPractice {
	
	public static void main(String[] args) {
		
		String selection = new String("a4");
		
		String output = vend(selection);
		System.out.println(output);
	}
	
	private static String vend(String choice) {
		String result = "";
		if (choice == "a1") {
			result = "Twix";
		} else if (choice == "a2") {
			result = "Snickers";
		} else if (choice == "a3") {
			result = "M&Ms";
		} else if ("a4".equals(choice)) {
			result = "ThreeMusketeers";
		} else {
			result = "MilkyWay";
		}
		return result;
	}

}
