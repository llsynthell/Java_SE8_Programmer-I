package chapter1;

public class Chicken {
	int numEggs = 0;
	String name;
	public Chicken() {
		name = "Duke";
	}
	
	public static void main(String[] args) {
		Chicken ch = new Chicken();
		System.out.println(ch.name);
	}
}
