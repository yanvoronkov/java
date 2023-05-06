package Stepic;

import java.util.Scanner;

public class Task1122 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int [] arr = new int[amt];
        for (int i = 0; i < amt; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * num);
        }

    }
}