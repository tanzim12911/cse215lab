package cp02;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(name);
        }
    }
}
