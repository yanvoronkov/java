package Stepic;

import java.util.Scanner;

public class Task1146 {
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
        int min = matrix[0][0];
        int minI = 0;
        int minJ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.println(minI + " " + minJ);

    }
}

