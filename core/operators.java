package core;
import java.util.Scanner;

public class operators {
public static void main(String args[])
{
	System.out.println("Enter your First name");
	
	Scanner s=new Scanner(System.in);
	s.next();
	
	System.out.println("Enter your Last name");
	s.next();
	
	System.out.println("Enter your 10th Marks");
	s.nextFloat();
	
	System.out.println("Enter your 12th Marks");
	s.nextFloat();
	
	System.out.println("Enter your Graduation Year");
	s.nextInt();
	
	System.out.println("Are you FCT studdent?");
	s.nextBoolean();
	
}
}
