package exception_handling;

import java.util.Scanner;

public class balance {
public static void main(String[] args) throws InsufficientBalanceException {
	Scanner sc=new Scanner(System.in);
	
	int balance=2000;
	
	System.out.println("Enter Amount:");
	int withdraw=sc.nextInt();
	
	if(withdraw<=balance) {
		System.out.println("Transaction Successful");
	}
	else {
		throw new InsufficientBalanceException("Insufficient Balance");
	}
}


}
