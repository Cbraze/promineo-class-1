package studentQuestions;

public class WhatCanGoInAndOutOfMethods {
	
	public static void main(String[] args) {
		
		int x = 6;
		int y = 9;
		System.out.println(sum(5, 7));
		System.out.println(sum(x, y));
		System.out.println(sum(x, 12));
		
		System.out.println(smallestNumber(6, 9, 100));
		System.out.println(smallestNumber(7, 2, 100));
		System.out.println(smallestNumber(6, 9, 1));
		
		int[] nums = { 5, 7, 34, 8, 9};
		int[] nums2 = { 5, 7, 1, 8, 9};
		int[] nums3 = { 5, 7, 34, 8, 2};
		System.out.println(smallestNumber(nums));
		System.out.println(smallestNumber(nums2));
		System.out.println(smallestNumber(nums3));
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int smallestNumber(int a, int b, int c) {
		int result = a;
		if (b < result) {
			result = b;
		}
		if (c < result) {
			result =c;
		}
		return result;
		
	}
	
	public static int smallestNumber(int[] numbers) {
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < result) {
				result = numbers[i];
			}
		}
		return result;
	}

}
