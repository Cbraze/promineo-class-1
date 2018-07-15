package studentQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingArraysAndLists {
	
	public static void main(String[] args) {
		
		System.out.println(args);
		System.out.println(new PrintingArraysAndLists());
		System.out.println(new Scanner(System.in));
		List<PrintingArraysAndLists> myList = new ArrayList();
		myList.add(new PrintingArraysAndLists());
		myList.add(new PrintingArraysAndLists());
		System.out.println(myList);
		
	}

}
