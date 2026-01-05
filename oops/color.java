package oops;

public class color extends flower {

	void red() {
		System.out.println("Roses are Red");
	}
	
	void blue() {
		System.out.println("Violets are blue");
	}
	
	public static void main(String[] args) {
		color ob=new color();
		ob.rose();
		ob.red();
		ob.violet();
		ob.blue();
	}
}
