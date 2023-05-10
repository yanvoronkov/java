package Stepic;

import java.util.Scanner;

public class Task1137 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            sum = array[i] + array[i - 1];
            System.out.print(sum + " ");
        }

    }
}

