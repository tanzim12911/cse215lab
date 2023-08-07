package lab01;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc =new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if (num > 0)
            System.out.print("The number is positive");
        else if (num < 0)
            System.out.print("The number is negative");
        else 
            System.out.print("The number is nither positive nor negative");
    }
}
