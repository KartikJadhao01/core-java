package core;

import java.util.Scanner;

public class task_stringLengthWithoutmethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int count=0;
	
	while(str.isEmpty()==false ) {
		count++;
	}
	System.out.println(count);
}
}
