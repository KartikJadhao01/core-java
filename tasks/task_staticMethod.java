package core;

import java.util.Scanner;

public class task_staticMethod {
//create one static method enter the string from  user and check whether string contains vowel or not
	
	public static void main(String[] args) {
		vowel();
	}
	
	static void vowel() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str=sc.next();
		
//		System.out.println(str.contains("a"));
		if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")) {
			System.out.println("Vowel is present");
		}
		else {
			System.out.println("Vowel is not present");
		}
	}
}
