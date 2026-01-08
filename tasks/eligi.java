package task;

public class eligi {
public static void main(String[] args) {
	int age=4;
	
	if(age>=18) {
		System.out.println("Eligible");
	}
	else {
		throw new ArithmeticException("not eligible");
//		System.out.println("Not Eligible");
	}
}
}
