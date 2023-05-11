package Stepic;

import java.util.Scanner;

public class Task1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[][] matrix = new int[n][n];
        boolean isSimmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSimmetric = false;
                }
            }
        }
        if (isSimmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

