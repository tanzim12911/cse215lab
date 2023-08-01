import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("Enter height: ");
        float b = sc.nextFloat();
        System.out.println(b);
        
        System.out.println("Enter name: ");
        char c = sc.next().charAt(0);
        System.out.println(c);
        
    }
}