package task;

public class ExH8 {
public static void main(String[] args) {
	String s=null;
	try {
		System.out.println(s.length());
		
		int a=10/0;
		System.out.println(a);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	catch(ArithmeticException ex) {
		System.out.println(ex);
	}
}
}
