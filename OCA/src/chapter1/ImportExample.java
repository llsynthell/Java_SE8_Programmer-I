package chapter1;

import java.util.Random; // imports the Random class

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random(); // Instantiates the Random object
		System.out.println(r.nextInt(10)); // prints number between 0 and 9
	}
}
