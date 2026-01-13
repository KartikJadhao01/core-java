package multithreading;

import java.util.Scanner;

public class table implements Runnable{

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num=sc.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(i*num);
		}
		
	}
	
	public static void main(String[] args) {
		table tb=new table();
		Thread t=new Thread(tb);
		t.start();
	}

}
