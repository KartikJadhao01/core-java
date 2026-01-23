package task;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Hashset {

	
	
	static void emp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many emloyee id you want to enter? ");
		int no_of_emp_id = sc.nextInt();
		
		HashSet <Integer> empid = new HashSet <Integer>();
		
		for(int i = 0 ; i < no_of_emp_id; i++) {
			System.out.println("Employee Id: ");
			
//			if(emp_id >= 0 || emp_id <=9 ) {
//				empid.add(emp_id);
//			}
//			else {
//				System.out.println("Enter Valid Employee Id.");
//			}
			
			try {
				int emp_id = sc.nextInt();
				empid.add(emp_id);
			}
			catch(InputMismatchException e) {
				System.out.println("Enter Valid Employee Id.");
			}
		}
		
		
		
		
		
		Iterator itr = empid.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}
	
	public static void main(String[] args) {
		emp();
	}
}
