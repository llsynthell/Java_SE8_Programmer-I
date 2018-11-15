package chapter2;

import java.util.Calendar;

public class UnderstandingJavaStatements {
	static int roomInBelly = 5;
	
	public static void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		if(bitesOfCheese == 0)
			System.out.println(bitesOfCheese + " pieces of cheese left");
		if(roomInBelly == 0)
			System.out.println(roomInBelly + " room in belly left");
	}
	
	public static void main(String[] args) {
		// ----The if-then Statement----
		System.out.println("----The if-then Statement----");
		Calendar now = Calendar.getInstance();
		
		if(now.get(Calendar.HOUR) < 11) {
			System.out.println("Good Morning");
		} else if(now.get(Calendar.HOUR) < 15)  {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
		
		// ----Ternary Operator ? :----
		System.out.println("----Ternary Operators ? :----");
		// if then
		int a1 = 10;
		int b1;
		if(a1 > 5) {
			b1 = 2 * a1;
		} else {
			b1 = 3 * a1;
		}
		System.out.println("if then: a = " + a1);
		System.out.println("if then: b = " + b1);
		// ternary
		int a2 = 10;
		int b2 = (a2 > 5) ? (2 * a2) : (3 * a2);
		System.out.println("ternary: a = " + a2);
		System.out.println("ternary: b = " + b2);
		// ----The Switch Statement----
		System.out.println("----The Switch Statement----");
		int dayOfWeek = 5;
		switch(dayOfWeek) {
			default:
				System.out.println("Weekday");
				break;
			case 0:
				System.out.println("Sunday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
		}
		
		// ----The While Statement----
		// uses the eatCheese() function
		System.out.println("----The While Statement----");
		eatCheese(6);
		
		// ----The do-while Statement
		System.out.println("----The do-while Statement----");
		int a3 = 0;
		do {
			a3++;
		} while(false);
		System.out.println(a3); // outputs 1
		
		// ----The for Statement----
		System.out.println("----The for Statement----");
		int a4 = 0;
		for(long b4 = 0, c4 = 4; a4 < 5 && b4 < 10; a4++, b4++) {
			System.out.println(b4 + " ");
		}
		
		// ----The for-each Statement
		System.out.println("----The for-each Statement----");
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.println(name);
		}		
	}
}
