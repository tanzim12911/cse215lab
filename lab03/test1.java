package lab03;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of A: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of B: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of C: ");
        double c = sc.nextDouble();

        double result = (b * Math.sqrt(a)) / (Math.PI * Math.pow(c, 2));

        System.out.println("Result: " + result);
    }
}
