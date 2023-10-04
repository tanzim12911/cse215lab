package cp02;

public class task2a {
    public static void main(String[] args) {
        int count = 5;
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = count; k >= 1; k--) {
                System.out.print(k);
            }
            count--;
            System.out.println();
        }
    }
}
