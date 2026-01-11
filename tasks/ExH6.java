package task;

public class ExH6 {
public static void main(String[] args) {
	try {
	
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		int arr[]= {10,20,30};
		System.out.println(arr[3]);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
