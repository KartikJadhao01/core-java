package core;

import java.util.Scanner;

public class task_stringContainsCharOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String str=sc.next();
	System.out.println("Enter Charcter");
	String ch=sc.next();
	
	boolean ispresent=str.contains(ch);
	
	if(ispresent==true) {
		System.out.println("Character is present");
	}
	else {
		System.out.println("Character is not present");
	}

}
}
