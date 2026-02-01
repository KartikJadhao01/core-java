package basic;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev = 0;
        int n = num;

        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if (rev == n){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
