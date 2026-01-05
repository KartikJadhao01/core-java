package core;

import java.util.Scanner;

public class task_ArrayWithUserInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sizeofarr[]= new int[5];
	
	for(int index=0;index<5;index++) {
		sizeofarr[index]=sc.nextInt();
	}
	
	for(int index=0;index<5;index++) {
		System.out.println(sizeofarr[index]);
	}
}
}
