package core;
import java.util.Scanner;

public class miniCalci {
public static void main(String args[]) {
	int num1;
	int num2;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number:");
	num1=s.nextInt();
	
	System.out.println("Enter second number:");
	num2=s.nextInt();
	
	System.out.println("Addition is:"+(num1+num2));
	System.out.println("Subtraction is:"+(num1-num2));
	System.out.println("multiplication is:"+(num1*num2));
	System.out.println("division is:"+(num1/num2));
}
}
