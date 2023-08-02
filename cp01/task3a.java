package cp01;

import java.util.Scanner;

public class task3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your BMI: ");
        double bmi = sc.nextDouble();

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Healthy");
        else if (bmi >= 25 && bmi <= 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
