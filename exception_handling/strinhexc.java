package exception_handling;

public class strinhexc {
	private static String s;

	public static void main(String[] args) {
		
		String s = null;
		try {
			System.out.println(s.length());
		}
		
		catch(Exception ex) {
			
			System.out.println(ex);
		}
		System.out.println("Thursday");

	}
}
