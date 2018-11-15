package chapter3;

import java.util.*;
import java.util.Arrays;

public class UnderstandingJavaArrays {
	public static void main(String[] args) {
		int[] numbers = {42, 53, 99};
		
		//---Creating an Array with Reference Variables---
		System.out.println("---Creating an Array with Reference Variables---");
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); 	// [Ljava.lang.String;@15db9742
		
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder();	// Does not compile because the array stores type String not StringBuilder
		//objects[0] = new StringBuilder();			// Breaks at compile because we can store objects in object array
		
		// ---Using an Array--- 
		System.out.println("\n---Using an Array---");
		String[] mammals = { "monkey", "chimp", "donkey" };
		System.out.println("mammals.length: " + mammals.length);	// 3
		System.out.println("mammals[0]: " + mammals[0]);			// monkey
		System.out.println("mammals[1]: " + mammals[1]);			// chimp
		System.out.println("mammals[2]: " + mammals[2]);			// donkey
		System.out.println("-array length-");
		String[] birds = new String[6];		// creates a String array with size 6 will null data
		System.out.println("birds.length: " + birds.length);		// size of birds is 6
		System.out.println("-for loop example for an array-");
		int[] numbers2 = new int[10];
		for (int i = 0; i < numbers2.length; i++) {	// iterator
			numbers2[i] = i + 5;						// sets the position to iterator + 5
			System.out.println("numbers[i]: " + numbers2[i]);
		}
		
		// ---Sorting---
		System.out.println("\n---Sorting---");
		int[] numbers3 = { 6, 9, 1 };
		Arrays.sort(numbers3);
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers3[i] + " ");
		
		// ---Searching---
		System.out.println("\n\n---Searching---");
		int[] numbers4 = { 2,4,6,8 };
		System.out.println(Arrays.binarySearch(numbers4, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers4, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers4, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers4, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers4, 9)); // -5
		
		// ---Multidimensional Arrays---
		System.out.println("---Multidimensional Arrays---");
		int[][] sameSize = {{1, 4}, {3, 1}, {9, 8}};
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		// -Using a Multidimensional Array-
		System.out.println("-Using a Multidimensional Array-");
		int[][] twoD = new int[3][2];
		System.out.println("-twoD 1-");
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " ");		// print element
			System.out.println();						// time for a new row
		}
		System.out.println("-twoD 2-");
		for (int[] inner : twoD) {
			for (int num : inner)
				System.out.print(num + " ");
			System.out.println();
		}
	}
}
