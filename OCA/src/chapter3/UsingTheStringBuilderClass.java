package chapter3;

public class UsingTheStringBuilderClass {
	public static void main(String[] args) {
		// ---Mutability and Chaining---
		System.out.println("---Mutability and Chaining---");
		StringBuilder sb = new StringBuilder("start"); // sb = "start"
		sb.append("+middle"); // sb = "start+middle"
		StringBuilder sb2 = sb.append("+end"); // sb = "start+middle+end" | sb2 = "start+middle+end"
		System.out.println("sb: " + sb + "\nsb2: " + sb2);
		
		// ---Creating a StringBuilder---
		System.out.println("\n---Creating a StringBuilder---");
		StringBuilder sbA = new StringBuilder(); // sbA = ""
		StringBuilder sbB = new StringBuilder("animal"); // sbB = "animal"
		StringBuilder sbC = new StringBuilder(10); // sbC has a size of 10 empty characters
		System.out.println("sbA: " + sbA + "\nsbB: " + sbB + "\nsbC: " + sbC);
		
		// ---Important StringBuilder Methods---
		System.out.println("\n---Important StringBuilder Methods---");
		// -charAt(), indexOf(), length(), and substring()-
		System.out.println("-charAt()-");
		sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // sub = anim
		int len = sb.length(); // len = 7
		char ch = sb.charAt(6); // ch = s
		System.out.println("sb: " + sub + " " + len + " " + ch);
		// -append()-
		System.out.println("-append()-");
		sb = new StringBuilder().append(1).append('c'); // sb = 1c
		sb.append("-").append(true); // sb = 1c-true
		System.out.println("sb: " + sb);
		// -insert()-
		System.out.println("-insert()-");
		sb = new StringBuilder("animals");
		sb.insert(6, "-"); 	// animal-
		sb.insert(1, "-"); 	// -animal-
		sb.insert(4,  "-");	// -ni-al-
		System.out.println("sb: " + sb);
		// delete() and deleteCharAt()
		System.out.println("-delete() and deleteCharAt()-");
		sb = new StringBuilder("abcdef");
		sb.delete(1, 3); // "adef"
		sb.deleteCharAt(1); // "aef"
		System.out.println("sb: " + sb);
		// reverse()
		System.out.println("-reverse()-");
		sb = new StringBuilder("animals");
		System.out.println("sb: " + sb.reverse());
		//toString()
		System.out.println("-toString()-");
		String s = sb.toString();
		System.out.println("s: " + s);
	}
}
