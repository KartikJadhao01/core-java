package core;

import java.util.Scanner;

public class employeeDetails {
	Scanner sc=new Scanner(System.in);
	static String cName="Fortune";
	
	
	void ename() {
		System.out.println("Enter Employee Name:");
		String empname=sc.next();
		System.out.println("Employee name:"+empname);
	}
	
	void eemail() {
		System.out.println("Enter Employee Email:");
		String empeml=sc.next();
		System.out.println("Employee name:"+empeml);
	}
	
	public static void main(String[] args) {
		
		
		employeeDetails ed=new employeeDetails();
		ed.ename();
		ed.eemail();
		System.out.println("Company name:" + cName);
	}
     
}
