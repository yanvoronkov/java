package Stepic;

import java.util.Scanner;

public class Task1125 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int[] arr = new int[amt];
        int temp = 0;
        for (int i = 0; i < amt; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        temp = arr[a];
        arr[a] = arr[b];
        arr [b] = temp;
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }

    }
}