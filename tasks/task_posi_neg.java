package core;
import java.util.Scanner;
public class task_posi_neg {
	public static void main(String args[]) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		if(num>=0) {
			System.out.println("positive");
		}
		else {
			System.out.println("negative");
		}
	}
}
