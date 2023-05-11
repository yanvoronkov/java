package Stepic;

import java.util.Scanner;

public class Task1149 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = m-1; i >= 0; i--) {

            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

    }
}

