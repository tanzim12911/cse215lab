package cp01;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int status = (num % 2 == 0)? 1:0;
        
        switch(status) {
            case 0:
                System.out.println(num + " is Odd");
                break;
            case 1:
                System.out.println(num + " is Even");
                break;
            default:
                break;
        }
    }
}
