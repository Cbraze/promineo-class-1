package week_3;

public class MethodPractice {
	
	public static void main(String[] args) {
		System.out.println(multiplyString("Yay", 3));

	}
	
	/*
	 * Write a method that takes two Strings, firstName and lastName and returns a full name
	 * firstName lastName
	 */
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	/*
	 * Write a method that takes two ints and returns the sum of the ints
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	/*
	 * Write a method that takes two ints and returns the product of the ints
	 */
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	/*
	 * Write a method that takes a String and an int and returns the String duplicated the int
	 * number of times. For example, if I pass in "Yay" and 3, it should return "YayYayYay"
	 */
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

}
