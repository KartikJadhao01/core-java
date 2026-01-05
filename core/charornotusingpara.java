package core;

import java.util.Scanner;

public class charornotusingpara {
    
    
    void find(char ch) {
    	if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
    		System.out.println("Alphabet");
    	}
    	else if(ch>='0' && ch<='9') {
    		System.out.println("Digit");
    	}
    	else {
    		System.out.println("Special Character");
    	}
    }
    
    public static void main(String[] args) {
    	System.out.println("Enter the character:");
    	Scanner sc=new Scanner(System.in);
        
        char ch=sc.next().charAt(0);
        
        charornotusingpara obj=new charornotusingpara();
        obj.find(ch);
	}
}
