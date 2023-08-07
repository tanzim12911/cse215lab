package lab02;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int i = 0, count = 0, a;
        System.out.println("Ener 6 numbers: ");
        Scanner sc = new Scanner(System.in);
        while (i < 6) {
            a = sc.nextInt();
            i++;
            if (a < 40 || a > 60)
                continue;
            count++;
        }

        System.out.println(count);
    }
}
