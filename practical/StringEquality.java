package practical;

import java.util.Scanner;

public class StringEquality {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First String: ");
	
	String first = sc.next();
	
	System.out.println("Enter Second String: ");
	String second = sc.next();
	if(first.equalsIgnoreCase(second)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not Equal");
	}
}
}
