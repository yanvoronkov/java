package Stepic;

import java.util.Scanner;

public class Task1124 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int[] arr = new int[amt];
        int sum = 0;
        for (int i = 0; i < amt; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

    }
}