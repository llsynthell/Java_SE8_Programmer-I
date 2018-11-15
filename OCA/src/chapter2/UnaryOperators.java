package chapter2;

public class UnaryOperators {
	public static void main(String[] args) {
		// understanding increment and decrement operators
		int counter = 0;
		System.out.println(counter); // 0
		System.out.println(++counter); // 1
		System.out.println(counter); // 1
		System.out.println(counter--); // 1
		System.out.println(counter); // 0
		
		// more complex understanding
		int x = 3;
		int y = ++x * 5 / x-- + --x; // 4 * 5 / 4 + 2;
		System.out.println("x is " + x); // 2
		System.out.println("y is " + y); // 7
	}
}
