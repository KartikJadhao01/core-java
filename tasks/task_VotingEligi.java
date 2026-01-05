package core;

import java.util.Scanner;

public class task_VotingEligi {
public static void main(String args[]) {
	System.out.println("Enter age");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	
	if(age>=18) {
		System.out.println("Eligible to Vote");
		System.out.println("Do you have voter id(true/false)");
		boolean voterId=sc.nextBoolean();
		
		if(voterId==true) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Apply to voter id card");
			System.out.println("Enter First name");
			String fname=sc.next();
//			if(fname<'a')
			
			System.out.println("Enter Last name");
			String lname=sc.next();
//			if()
			
			System.out.println("Enter Mobile No.");
			long mobile_no=sc.nextLong();
			if(mobile_no>=0 || mobile_no<=9) {
				System.out.println("Enter Aadhar No.");
			}
			
			long adhar_no=sc.nextLong();
			
			System.out.println("Enter PAN No.");
			String pan_no=sc.next();
			
			System.out.println("Application successful");
		}
		
	}
	else {
		System.out.println("You are not eligible");
	}
	
	
}
}
