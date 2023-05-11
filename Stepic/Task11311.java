package Stepic;

import java.util.Scanner;

public class Task11311 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            sum+=array[i];
        }

        System.out.println(sum);


    }
}

