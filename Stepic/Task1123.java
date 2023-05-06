package Stepic;

import java.util.Scanner;

public class Task1123 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int [] arr = new int[amt];
        int sum = 0;
        for (int i = 0; i < amt; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}