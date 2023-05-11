package Stepic;

import java.util.Scanner;

public class Task1154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array [i] = sc.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if (array[i] > array[i+1] && array[i] > array[i-1]) {
                count++;
            }
        }
        System.out.println(count);



    }
}


