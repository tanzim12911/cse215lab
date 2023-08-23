/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp03;

import java.util.Scanner;

/**
 *
 * @author LIB602IP67
 */
public class task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = sc.nextDouble();
        
        double area = 0;
        
        if (s < 0) {
            System.out.println("The area can not be computed due to invalid side length");
        }
        else
            area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
            System.out.printf("The area of the hexagon is %.2f\n", area);
    }
    
}
