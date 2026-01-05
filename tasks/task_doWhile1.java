package core;

import java.util.Scanner;

public class task_doWhile1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String name=sc.next();
	int n=1;
	System.out.println("Enter count");
	int count=sc.nextInt();
	do {
		System.out.println(name);
		n++;
	}
	while(n<=count);
}
}
