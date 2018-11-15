package chapter3;

import java.util.*;
import java.util.ArrayList;

public class UnderstandingAnArrayList {
	public static void main(String[] args) {
		// ---Creating an ArrayList---
		System.out.println("---Creating an ArrayList---");
		// pre-Java 5
		ArrayList list1 = new ArrayList();		// default ArrayList compiler
		ArrayList list2 = new ArrayList(10);	// builds an ArrayList with 10 slots
		ArrayList list3 = new ArrayList(list2);	// copy another ArrayList
		// post-Java 5: generics
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		// ---UsingAnArrayList---
		// -add()-
		System.out.println("-add()-");
		list1.add("hawk");			// list1: [hawk]
		list1.add(Boolean.TRUE);	// list1: [hawk, true]
		System.out.println(list1);
		list5.add("sparrow");		// compiles
		//list5.add(Boolean.TRUE);	// does NOT compile because the ArrayList stores String not Boolean
		List<String> birds = new ArrayList<>();
		birds.add("hawk");			// birds: [0:hawk]
		birds.add(1, "robin");		// birds: [0:hawk,1:robin]
		birds.add(0, "blue jay");	// birds: [0:blue jay,1:hawk,2:robin]
		birds.add(1, "cardinal");	// birds: [0:blue jay,1:cardinal,2:hawk,3:robin]
		System.out.println(birds);
		// -remove()-
		System.out.println("-remove()-");
		birds = new ArrayList<>();
		birds.add("hawk");								// birds: [0:hawk]
		birds.add("hawk");								// birds: [0:hawk,1:hawk]
		System.out.println("birds: " + (birds.remove("cardinal")));	// prints 'false'
		System.out.println("birds: " + (birds.remove("hawk")));		// prints 'true' [0:hawk]
		System.out.println("birds: " + birds);
		System.out.println("birds: " + birds.remove(0));			// prints 'hawk' []
		System.out.println("birds: " + birds);
		// -set()-
		System.out.println("-set()-");
		birds.add("hawk");								// birds: [hawk]
		System.out.println("birds: " + birds.size());	// birds: 1
		birds.set(0,  "robin");							// birds: [robin]
		System.out.println("birds: " + birds.size());	// birds: 1
		System.out.println(birds);
		// -isEmpty() and size()-
		System.out.println("-isEmpty() and size()-");
		birds = new ArrayList<>();
		System.out.println("birds: " + birds.isEmpty());	// birds: true
		System.out.println("birds: " + birds.size());		// birds: 0
		birds.add("hawk");									// birds: [0:hawk]
		birds.add("hawk");									// birds: [0:hawk,1:hawk]
		System.out.println("birds: " + birds.isEmpty());	// birds: false
		System.out.println("birds: " + birds.size());		// birds: 2
		// -clear()-
		birds = new ArrayList<>();
		birds.add("hawk");								// birds: [0:hawk]
		birds.add("hawk");								// birds: [0:hawk,1:hawk]
		System.out.println(birds.isEmpty());			// birds: false
		System.out.println("birds: " + birds.size());
		birds.clear();									// birds: []
		System.out.println("birds: " + birds.isEmpty());// birds: true
		System.out.println("birds: " + birds.size());	// birds: 0
		// -contains()-
		System.out.println("-contains()-");
		birds = new ArrayList<>();
		birds.add("hawk");											// birds: [0:hawk]
		System.out.println("birds: " + birds.contains("hawk"));		// birds: true
		System.out.println("birds: " + birds.contains("robin"));	// birds: false
		// -equals()-
		System.out.println("-equals()-");
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println("one == two: " + one.equals(two));		// one == two : true
		one.add("a");												// one: [0:a]
		System.out.println("one == two: " + one.equals(two));		// one == two : false
		two.add("a");
		System.out.println("one == two: " + one.equals(two));		// one == two : true
		one.add("b");												// one: [0:a,1:b]
		two.add(0, "b");											// one: [0:b,1:a]
		System.out.println("one == two: " + one.equals(two));		// one == two : false
		// ---Wrapper Classes---
		System.out.println("\n---Wrapper Classes---");
		int primitive = Integer.parseInt("123");	// String to int primitive
		Integer wrapper = Integer.valueOf("123");	// String to int wrapper class
		// --Autoboxing--
		System.out.println("\n---Autoboxing---");
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);				// weights: [0:50.5]
		weights.add(new Double(60));	// weights: [0:50.5,1:60.0]
		weights.remove(50.5);			// weights: [0:60.0]
		double first = weights.get(0);	// first: 60.0
		System.out.println("first: " + first);
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);		// numbers: [0:1]
		numbers.add(2);		// numbers: [0:1,1:2]
		numbers.remove(1);	// numbers: [0:1]
		System.out.println("numbers: " + numbers);
		// --Converting Between array and List--
		System.out.println("\n---Converting Between Array to List---");
		List<String> list = new ArrayList<>();
		list.add("hawk");									// list: hawk
		list.add("robin");									// list: hawk, robin
		Object[] objectArray = list.toArray();				// objectArray: [0:hawk,1:robin]
		System.out.println("objectArray.length: " + objectArray.length);		
		String[] stringArray = list.toArray(new String[0]);	// StringArray: [0:hawk,1:robin]
		System.out.println("stringArray.length: " + stringArray.length);
		// -backed lists-
		System.out.println("-backed lists-");
		String[] array = { "hawk", "robin" };				// array: [0:hawk,1:robin]
		list = Arrays.asList(array);						// list & array: 0:hawk,1:robin
		System.out.println("list.size: " + list.size());
		list.set(1, "test");								// list & array: 0:hawk,1:test
		array[0] = "new";									// list & array: 0:new,1:test
		for (String s : array)
			System.out.print(s + " ");
		// --Sorting--
		System.out.println("\n---Sorting---");
		numbers = new ArrayList<>();	// numbers = []
		numbers.add(99);				// numbers = [0:99]
		numbers.add(5);					// numbers = [0:99,1:5]
		numbers.add(81);				// numbers = [0:99,1:5,2:81]
		System.out.println("before sort - numbers: " + numbers);
		Collections.sort(numbers);		// numbers = [0:5,1:81,2:99]
		System.out.println("after sort - numbers: " + numbers);
	}
}
