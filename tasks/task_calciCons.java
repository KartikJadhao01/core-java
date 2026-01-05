package oops;

import java.util.Scanner;

public class task_calciCons {

	Scanner sc=new Scanner(System.in);
//	int a=sc.nextInt();
//	int b=sc.nextInt();
	
	task_calciCons(){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	
	task_calciCons(int c){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a-b);
	}
	
	task_calciCons(float c){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(b*c);
	}
	
	task_calciCons(int d,float z){
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		task_calciCons add=new task_calciCons();
		task_calciCons sub=new task_calciCons(2);
		task_calciCons mul=new task_calciCons(1.0f);
		task_calciCons div=new task_calciCons(1,2.0f);
	}
}
