package task;

public class ExH7 {
public static void main(String[] args) {
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println(e);
		
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
}
