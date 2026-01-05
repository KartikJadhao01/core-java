package core;

import java.util.Scanner;

public class task_indexOfchar {
public static void main(String[] args) {
	Scanner data =new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=data.next();
	System.out.println("Enter the char:");
	char ch=data.next().charAt(0);
	
	System.out.println(str.indexOf(ch));

//	data.close();
}
}
