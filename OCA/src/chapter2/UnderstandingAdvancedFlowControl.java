package chapter2;

public class UnderstandingAdvancedFlowControl {
	public static void main(String[] args) {
		// ----Nested Loops----
		System.out.println("----Nested Loops----");
		// for & for each loop example
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray : myComplexArray) {
			System.out.println("__START_ARRAY__");
			for(int i=0; i<mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i]+"\t");
			}
			System.out.println("__END___ARRAY__");
		}
		// do while example
		System.out.println("do while example");
		int a1 = 20;
		while(a1>0) {
			do {
				a1 -=2;
			} while (a1 > 5);
			a1--;
			System.out.println(a1);
		}		
		// optional labels
		System.out.println("optional labels");
		int[][] myComplexArray2 = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray2 : myComplexArray) {
			INNER_LOOP: for(int i=0; i<mySimpleArray2.length; i++) {
				System.out.println(mySimpleArray2[i]);
			}
			System.out.println();
		}
		// the break statement
		System.out.println("the break statement");
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;	
				}				
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");;
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}
		// the continue statement
		System.out.println("the continue statement");
		FIRST_CHAR_LOOP: for(int a2=1; a2<=4; a2++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a2 == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.println(" " + a2 + x);
			}
		}
	}
}
