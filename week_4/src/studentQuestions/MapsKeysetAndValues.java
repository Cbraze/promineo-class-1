package studentQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapsKeysetAndValues {
	
	public static void main(String[] args) {
		
		//String - Teacher Name
		//List<String> - list of student names
		Map<String, List<String>> rooms = new HashMap<String, List<String>>();
		
		List<String> room1 = new ArrayList<String>();
		room1.add("Bob");
		room1.add("Sam");
		room1.add("Tom");
		
		List<String> room2 = new ArrayList<String>();
		room2.add("Nick");
		room2.add("Tommy");
		room2.add("Kirk");
		
		List<String> room3 = new ArrayList<String>();
		room3.add("Tali");
		room3.add("Sandra");
		room3.add("Baroc");
		
		rooms.put("Mr. Grace", room1);
		rooms.put("Ms. Smith", room2);
		rooms.put("Mr T.", room3);
		
		Set<String> teachers = rooms.keySet();
		
		for (String teacher : teachers) {
			System.out.println(teacher);
		}
		
		Collection<List<String>> studentLists = rooms.values();
		
		for (List<String> studentList : studentLists) {
			System.out.println(studentList);
		}
		
		for (String teacher : teachers) {
			System.out.println(teacher + " : " + rooms.get(teacher));
		}
	}

}
