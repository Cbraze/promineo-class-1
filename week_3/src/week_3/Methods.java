package week_3;

public class Methods {
	
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
		
		sayHello(students[4]);
		sayHello("Nick");
		
		int nick = findStudentIndex(students, "Nick");
		System.out.println(nick);
		
		int sam = findStudentIndex(students, "Sam");
		System.out.println(sam);
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
	
	public static int findStudentIndex(String[] array, String name) {
		int position = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(name)) {
				position = i;
			}
		}
		
		return position;
	}

}
