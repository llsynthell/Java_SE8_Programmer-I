package chapter2;

public class AdditionalBinaryOperators {
	public static void main(String[] args) {
		// ---Assignment Operator---
		// the = assigns 1 to x
		int x = 1;
		// ---Casting Primitive Values---
		x = (int)1.0; // stored as 1
		System.out.println(x);
		short y = (short)1921222; // stored as 20678, note sytem cost for overflow
		System.out.println(y);
		int z = (int)9f; // stored as 9
		System.out.println(z);
		long t = 192301398193810323L; // stored as 192301398193810323
		System.out.println(t);
		short a = 3;
		short b = 10;
		short c = (short)(a*b);
		System.out.println(c); // stored as a short with a value of 30
		
		// ---Compound Assignment Operators---
		int a2 = 2, b2 = 3;
		a2 = a2 * b2; // simple assignment operator
		a2 *= z; // compound assignment operator
		System.out.println(a2); // stored as an int with a value of 54
		long a3 = 10; // a long is created for a3 with a value of 10
		int b3 = 5; // an int is created for b3 with a value of 5
		a3 *= b3; // b3 is cast to a long and then a3 is with the value is cast to an int
		System.out.println(a3); // stored as an int with a value of 50
		long a4 = 5; // a4 is instantiated with the value of 5
		long b4 = (a4=3); // a4 is set to 3 and the value of 3 is returned for b4 to be set to
		System.out.println(a4); // a4 is 3
		System.out.println(b4); // b4 is 3
		
		// ----Relational Operators----
		int a5=10, b5=20, c5=10;
		System.out.println(a5 < b5); // output is true
		System.out.println(a5<=b5); // output is true
		System.out.println(a5>=c5); // output is true
		System.out.println(a5>c5); // output is false
		
		// ----Logical Operators----
		int a6 = 6;
		boolean b6 = (a6 >= 6) || (++a6 <= 7); // the right hand side is never ran
		System.out.println(a6);
		System.out.println(b6);
		
		// Equality Operators
		boolean a7 = false;
		boolean b7 = (a7 = true);
		System.out.println(a7); // a7 outputs true
		System.out.println(b7); // b7 outputs true
	}
}
