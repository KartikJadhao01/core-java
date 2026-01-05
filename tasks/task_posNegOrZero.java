package core;

import java.util.Scanner;

public class task_posNegOrZero {
	public static void main(String args[]) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		if(num>=1) {
			System.out.println("positive");
		}
		else if(num==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("negative");
		}
	}
}
