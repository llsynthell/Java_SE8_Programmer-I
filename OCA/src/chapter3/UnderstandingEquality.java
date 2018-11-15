package chapter3;

public class UnderstandingEquality {
	public static void main(String[] args) {
		// ---Understanding Equality---
		System.out.println("---Understanding Equality---");
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder("a");
		StringBuilder three = one.append("a");
		System.out.println("one == two: " + (one == two));		// one = "a", two = "a" | false | different object, same data
		System.out.println("one == three: " + (one == three));	// one = "a", three = "a" | true | same object
		String x = "Hello World";			// x = "Hello World" object 1
		String z = " Hello World".trim(); // z = "Hello World" object 2
		System.out.println("x == z: " + (x == z));					// false | same data, different object
		System.out.println("x.equals(z): " + (x.equals(z)));		// x data is the same as z data
	}
}
