package core;

import java.util.Scanner;

public class nestedifelse {
public static void main(String args[]) {
	//check whether user has playstore app?
	//then only install pubg
	
	Scanner sc=new Scanner(System.in);
	System.out.println("do you have play store?(true or false)");
	boolean play_store=sc.nextBoolean();
	
	if(play_store==true) {
		System.out.println("is pubg present?(true or false)");
		boolean is_pubg=sc.nextBoolean();
		if(is_pubg=true) {
			System.out.println("Installation completed");
		}
		else {
			System.out.println("installation failed");
		}
	}
	else {
		System.out.println("Download Playstore");
	}
}
}
