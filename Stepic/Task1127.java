package Stepic;

import java.util.Scanner;

public class Task1127 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] counts = new int[arr.length];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counts[i] = count;
        }

        for (int i = 0; i < arr.length; i++) {
            if (counts[i] == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}

