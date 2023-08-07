package lab01;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        System.out.println("Enter age and height in ft: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        float height = sc.nextFloat();
        int a = (age > 20) ? 1 : 0;
        int b  = (height > 5 && height < 6) ? 1 : 0;

        switch(a) {
            case 0:
                System.out.println("Not Eligible");
                break;
                case 1:
                    switch(b) {
                        case 0:
                            System.out.println("Not Eligible");
                            break;
                        case 1:
                            System.out.println("Eligible");
                            break;
            default:
                System.out.println("Error");
                    }
        }

    }
}
