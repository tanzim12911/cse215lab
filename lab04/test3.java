package lab04;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter colA, rowA, colB, rowB: ");
        int colA = sc.nextInt();
        int rowA = sc.nextInt();
        int colB = sc.nextInt();
        int rowB = sc.nextInt();

        if (colA != rowB) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }

        int matA [][] = new int[rowA][colA];
        int matB [][] = new int[rowB][colB];
        int matR [][] = new int[rowA][colB];

        System.out.println("Enter elements of the Matrix A: ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the Matrix B: ");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                matB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                matR[i][j] = matA[i][j] * matB[j][i];   
            }
        }

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                System.out.print(matR[i][j] + " ");  
            }
        }
    }
}
