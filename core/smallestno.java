package core;

import java.util.Scanner;

public class smallestno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number:");
	int a=sc.nextInt();
	System.out.println("Enter Number:");
	int b=sc.nextInt();
	System.out.println("Enter Number:");
	int c=sc.nextInt();
	System.out.println("Enter Number:");
	int d=sc.nextInt();
	
	if(a<b && a<c && a<d) {
		System.out.println(a+" is smallest");
	}
	else if(b<a && b<c && b<d) {
		System.out.println(b+" is smallest");
	}
	else if(c<a && c<b && c<d) {
		System.out.println(c+" is smallest");
	}
	else {
		System.out.println(d+" is smallesst");
	}
}
}
