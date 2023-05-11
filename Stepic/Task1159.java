package Stepic;

import java.util.Scanner;

public class Task1159 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean flag = false;
        int[][] matrix = new int[n][m];
        int maxNum = matrix[0][0];
        int iBestPlayer = 0;
        int jBestPlayer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxNum < matrix[i][j]) {
                    maxNum = matrix[i][j];
                    iBestPlayer = i;
                    jBestPlayer = j;
                }
                if (maxNum == matrix[i][j]) {
                    if (i < iBestPlayer) {
                        iBestPlayer = i;
                        jBestPlayer = j;
                    }
                    if (i == iBestPlayer) {
                        if (j < jBestPlayer) {
                            jBestPlayer = j;
                        }
                    }
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(iBestPlayer + " " + jBestPlayer);




    }
}


