package Stepic;

import java.util.Scanner;

public class Task1147 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            matrix[i] = new int[m];
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }

        }
        System.out.println(maxRowIndex+1);
        System.out.println(maxRowSum);
        for (int i = 0; i < matrix[maxRowIndex].length; i++) {
            System.out.print(matrix[maxRowIndex][i] + " ");
        }

    }
}

