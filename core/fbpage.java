package core;
import java.util.Scanner;

public class fbpage {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("First Name");
	s.next();
	
	System.out.println("Surname");
	s.next();
	
	System.out.println("Day");
	s.nextInt();
	
	System.out.println("Month");
	s.nextInt();
	
	System.out.println("Year");
	s.nextInt();
	
	System.out.println("Gender(Male/Female)");
	s.next();
	
	 System.out.println("Mobile number or Email");
     s.next();

     System.out.println("Enter Password: ");
     s.next();
}
}
