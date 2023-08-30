package lab05;

public class test2 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(4.5, 5.5));
        System.out.println(add(x));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static int add(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum;
    }
}
