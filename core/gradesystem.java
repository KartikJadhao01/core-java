package core;

import java.util.Scanner;

public class gradesystem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Marks of student:");
	int marks=sc.nextInt();
	
	if(marks>80) {
		System.out.println("A grade");
	}
	else if(marks<75 && marks>60) {
		System.out.println("B grade");
	}
	else if(marks<60) {
		System.out.println("C grade");
	}
	else if(marks<35) {
		System.out.println("Fail");
	}
}
}
