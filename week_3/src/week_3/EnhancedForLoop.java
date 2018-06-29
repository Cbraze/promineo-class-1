package week_3;

public class EnhancedForLoop {
	
public static void main(String[] args) {
		
		String[] students = new String[5];
		
		students[0] = "Leiland";
		students[1] = "Sam";
		students[2] = "Daniel";
		students[3] = "Kirsten";
		students[4] = "Keith";
		
		for (String student : students) {
			System.out.println(student);
			System.out.println("Hello, " + student);
		}
		
		/*
		 * Use a traditional for loop (shown below) when you need to keep track of the index
		 * for any reason.
		 * If you don't need to know the index, and you just want to iterate over
		 * each element in an array, always use the enhanced for loop above.
		 */
		int positionOfKirsten = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals("Kirsten")) {
				positionOfKirsten = i;
			}
		}
		
		System.out.println(students[positionOfKirsten] + " was found at position " + positionOfKirsten);
		
	}

}
