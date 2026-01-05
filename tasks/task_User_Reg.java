package core;

import java.util.Scanner;

public class task_User_Reg {
public static void main(String args[]) {
	System.out.println("Enter Username");
	Scanner sc=new Scanner(System.in);
	boolean is_user=sc.nextBoolean();
	
	
	
	if(is_user==true) {
		System.out.println("Enter Password");
		boolean is_pass=sc.nextBoolean();
		if(is_pass==true) {
			System.out.println("Registration successful");
		}
		else {
			System.out.println("Incorrect Password");
		}
	}
	else {
		System.out.println("Registration failed");
	}
}
}
