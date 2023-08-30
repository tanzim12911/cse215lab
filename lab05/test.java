package lab05;

public class test {
    public static void main(String[] args) {
        System.out.println("Printing prime numbers between 1-100: ");
        for (int i = 2; i <= 100; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    static boolean isPrime(int x) {
        boolean status = false;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                status = false;
                break;
            }
        }
        return status;
    }
}
