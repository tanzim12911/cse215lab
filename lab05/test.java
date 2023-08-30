package lab05;

public class test {
    public static void main(String[] args) {
        System.out.println("Printing prime numbers between 1-100: ");
        for (int i = 1; i <= 100; i++) {
            System.out.println(primeNum(i));
        }
    }

    static int primeNum(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return x;
        }

        return -1;
    }
}
