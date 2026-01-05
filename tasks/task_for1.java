package core;

import java.util.Scanner;

public class task_for1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No.:");
	String name=sc.next();
	System.out.println("Enter count");
	int count=sc.nextInt();
	
	for(int n=1;n<=n*count;n++) {
		System.out.println(name);
	}
}
}
