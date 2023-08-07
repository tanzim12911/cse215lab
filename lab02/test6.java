package lab02;

public class test6 {
    public static void main(String[] args) {
        int i = 0, j = 0, n = 5;
        
        for(i = n; i >= 0; i--) {
            
            for(j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            for(j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
