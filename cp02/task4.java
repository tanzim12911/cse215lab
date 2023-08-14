package cp02;

public class task4 {
    public static void main(String[] args) {
        
        int numFirst = 100;
        int numLast = 150;
        while (numFirst <= numLast) {
            
            if (numLast % 8 == 0) {
                System.out.print(numLast + " ");
            }
            numLast--;
        }
    }
}
