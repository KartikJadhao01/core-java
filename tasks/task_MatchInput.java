package core;

import java.util.Scanner;

public class task_MatchInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String 1:");
	String str1=sc.next();
	System.out.println("Enter String 2:");
	String str2=sc.next();
	
	System.out.println(str1.equalsIgnoreCase(str2));
}
}
