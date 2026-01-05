package core;

import java.util.Scanner;

public class task_withoutIndexOf {
public static void main(String[] args) {
	System.out.println("Enter string:");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	
	System.out.println("Enter Character");
	char ch=sc.next().charAt(0);
	
	int index=0;
	for(int i=0;i<str.length();i++) {
		if(ch==str.charAt(i)) {
			index=i;
		}
	}
	System.out.println(index);
}
}
