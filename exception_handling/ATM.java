package exception_handling;

import java.util.Scanner;

public class ATM {
public static void main(String[] args) throws InvalidPinException{
	Scanner sc=new Scanner(System.in);
	
	int correctpin=1234;
	int userentpin=sc.nextInt();
	
	if(userentpin == correctpin) {
		System.out.println("Successful");
	}
	else {
		throw new InvalidPinException("Invalid Pin");
	}
}
}
