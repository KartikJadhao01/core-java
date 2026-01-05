package core;

import java.util.Scanner;

public class task_wocharAT {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter String:");
	String str=sc.next();
	
	System.out.println("Enter index:");
	int index=sc.nextInt();
	
	char charray[]=str.toCharArray();
	System.out.println("The character at index " + index + " is " + charray[index]);
}
}
