package chapter4;

public class DesigningMethods {
	// ---Methods---
	public void walk1() {}						// public access, does not return a value
	
	private void walk2() { return; }			// private access, does not return a value
	
	public static String walk3() { return "walk3"; }	// public access, returns a String object
	
	private static int integer() {
		return 9;
	}
	
	private static int addNumbers(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// ---Designing Methods
		System.out.println("---Designing Methods---");
		
		// ---Return Type---
		System.out.println("\n---Return Type---");
		System.out.println("walk3 returns: " + walk3());
		System.out.println("integer returns: " + integer());
		
		// ---Method Name---
		System.out.println("\n---Method Name---");
		System.out.println("Method names follow the same rules as variable names.");
		
		// ---Parameter List---
		System.out.println("\n---Parameter List---");
		System.out.println("addNumbers(2, 3): " + addNumbers(2,3));
	}
}
