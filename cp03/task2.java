/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp03t2;

import java.util.Scanner;

/**
 *
 * @author LIB602IP67
 */
public class CP03T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String s1: ");
        String s1 = sc.next();
        System.out.print("Enter String s2: ");
        String s2 = sc.next();
        
        if (s1.indexOf(s2) == 0) {
            System.out.printf("The string \"%s\" starts with \"%s\".\n", s1, s2 );
        }
        else if(s1.indexOf(s2.charAt(s2.length() - 1)) == s1.length() - 1)
        {
            System.out.printf("The string \"%s\" ends with \"%s\".\n", s1, s2 );
        }
                
        else 
        {
            System.out.printf("The string \"%s\" does not start or end with \"%s\".\n", s1, s2 );
        }
        
    }
    
}
