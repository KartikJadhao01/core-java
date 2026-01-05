package core;

import java.util.Scanner;

public class task_woContains {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str=sc.next();
		
		System.out.println("Enter Character:");
		char ch=sc.next().charAt(0);
		
		int count=0;
		
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==ch) {
			    count++;
			}
		}
		
		if(count>0) {
			System.out.println(ch+" is present in "+str);
		}
		else {
			System.out.println(ch+" is not present in "+str);
		}
	}
}
