import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();

        switch(a) {
            case "one":
                System.out.println("Beginner");
                break;
            case "two":
                System.out.println("Intermediate");
                break;
            case "three":
                System.out.println("Pro");
                break;


        }
    }
}
