package lab03;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inp_char = sc.next().charAt(0);
        System.out.print("Enter a string: ");
        String inp_str = sc.nextLine();

        String out_str = inp_str.replace(inp_char, ' ');
        System.out.println(out_str);
    }
}
