package Stepic;

import java.util.Scanner;

public class Task11411 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isMagic = true;
        int sumEtalon = 0;
        for (int i = 0; i < n; i++) {
            sumEtalon += matrix[0][i];
        }
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for (int i = 0; i < n; i++) {

            int sumString = 0;
            int sumColumn = 0;
            for (int j = 0; j < n; j++) {
                sumString += matrix[i][j];
                sumColumn += matrix[j][i];
                if (i == j) sumDiagonal1 += matrix[i][j];
                if (i == j) sumDiagonal2 += matrix[j][i];
            }
            if (sumString != sumEtalon || sumColumn != sumEtalon) {
                isMagic = false;
            }
//            System.out.println(sumString + " " + sumColumn);

        }
        if (sumDiagonal1 != sumEtalon || sumDiagonal2 != sumEtalon) {
            isMagic = false;
        }
//        System.out.println(sumDiagonal1 + " " + sumDiagonal2);

        System.out.println(isMagic ? "YES" : "NO");

    }
}

