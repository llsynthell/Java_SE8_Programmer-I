package chapter3;

public class CreatingAndManipulatingStrings {
	public static void main(String[] args) {
		// ---Concatenation---
		System.out.println("---Concatenation---");
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); //ab3
		System.out.println(1 + 2 + "c"); // 3c
		System.out.println("a" + 1 + 3); //a13
		// using variables
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); // 64
		// using +=
		String s = "1"; // s is instantiated with the string value of "1"
		s += "2"; // s is now string "12"
		s += 3; // s is now string "123"
		System.out.println(s); // prints string "123"
		
		// ---Important String Methods
		System.out.println("---Important String Methods---");
		// length()
		System.out.println("-length()-");
		String animals = "animals"; // a|1,n|2,i|3,m|4,a|5,l|6,s|7
		System.out.println(animals.length()); // 7
		// charAt()
		System.out.println("-charAt()-");
		System.out.println(animals.charAt(0)); // a
		System.out.println(animals.charAt(3)); // m
		// indexOf()
		System.out.println("-indexOf()-");
		System.out.println(animals.indexOf('a')); // 0
		System.out.println(animals.indexOf('m')); // 3
		// substring()
		System.out.println("-substring()-");
		System.out.println(animals.substring(3)); // mals
		System.out.println(animals.substring(3, 4)); //m
		System.out.println(animals.substring(animals.indexOf('m'))); // mals
		System.out.println(animals.substring(3,7)); // mals
		// toLoweverCase() and toUpperCase()
		System.out.println("-toLowerCase() and toUpperCase()-");
		System.out.println(animals.toUpperCase()); // ANIMALS
		System.out.println("ABC123".toLowerCase()); // abc123
		// equals() and equalsIgnoreCase()
		System.out.println("-equals() and equalsIgnoreCase()-");
		System.out.println("abc".equals("abc")); // true
		System.out.println("abc".equals("ABC")); // false
		System.out.println("abc".equalsIgnoreCase("ABC")); // true
		// startsWith() and endsWith()
		System.out.println("-startsWith() and endsWith()-");
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		// contains()
		System.out.println("-contains()-");
		System.out.println(animals.contains("a")); // true
		System.out.println("abc".contains("c")); // true
		System.out.println("abc".contains("d")); // false
		// trim()
		System.out.println(" abc ".trim()); // "abc"
		System.out.println("\n	a   b c    \n".trim()); // "a	b c"
		
		// ---Method Chaining---
		System.out.println("---Method Chaining---");
		animals = "\nAniMaL	";
		System.out.println(animals.trim().toLowerCase().replace("a", "A"));	// "AnimAl"
		
	}
}
