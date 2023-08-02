package cp01;

import java.util.Scanner;

public class task3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your BMI: ");
        double bmi = sc.nextDouble();

        String result = (bmi < 18.5) ? "Underweight" : (bmi >= 18.5 && bmi <= 24.9) ? 
        "Healthy" : (bmi >= 25 && bmi <= 29.9) ? "Overweight" : (bmi >= 30 && bmi <= 39.9) ? 
        "Obese" : "Incorrect BMI";

        System.out.println(result);
    }
}
