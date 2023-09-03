package lab05;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = sc.next();
        boolean status = isPalindrome(num);

        if (status)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static boolean isPalindrome(String x) {
        boolean status = false;
        String reverse;
        for (int i = 0; i < x.length(); i++) {
            reverse = x.charAt(x.length() - 1);
        }

        return status;
    }
}
