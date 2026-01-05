package core;

public class elseif {
	public static void main(String args[]) {
		//check whether number 50 is less than or equal to 80 or is equal to 70
		int num=50;
		if(num>=80) {
			System.out.println("1st condition is true");
		}
		else if(num==70) {
			System.out.println("2nd condition is true");
		}
		else {
			System.out.println("both conditions are true");
		}
	}
}
