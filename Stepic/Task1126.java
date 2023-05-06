package Stepic;

import java.util.Scanner;

public class Task1126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int[] arr = new int[amt];
        for (int i = 0; i < amt; i++) {
            arr[i] = sc.nextInt();
        }
        int height = sc.nextInt();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (height <= arr[i]) {
                count = i + 2;
            }
        }
        System.out.println(count);

    }
}