package multithreading;

import java.util.Scanner;

public class arrthread extends Thread {
	
	Scanner sc=new Scanner(System.in);
	
	public void run() {
		
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
public static void main(String[] args) {
	arrthread at=new arrthread();
	at.start();
}
}
