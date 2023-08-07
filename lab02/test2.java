package lab02;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int a, b, i, lcm = 0, max;
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        max = (a > b) ? a : b;
        for(i = 0; i < max; i++) {
            lcm = max;
            if (max % a == 0 && max % b == 0) {
                break;
            }
            max++;
        }

        System.out.println("LCM = " + lcm);

    }
