package chapter1;

public class Name {
	String first = "Theodore";
	String last = "Moose";
	String full = first + " " + last;
	
	public static void main(String[] args) {
		Name n = new Name();
		System.out.println(n.full);
	}
}
