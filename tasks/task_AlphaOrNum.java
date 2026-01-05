package core;

import java.util.Scanner;

public class task_AlphaOrNum {
	public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } 
        else{
            System.out.println("Digit");
        } 
    }
}
