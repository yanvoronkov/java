package Stepic;

import java.util.Scanner;

public class Task11510 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int countWinners = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                countWinners = 1;
            } else if (sum == maxSum) {
                countWinners++;
            }
        }
        System.out.println(countWinners);
        //find index of winner
        int winnerIndex = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            if (sum == maxSum) {
                winnerIndex = i;
                System.out.print(winnerIndex + " ");
            }
        }




    }
}


