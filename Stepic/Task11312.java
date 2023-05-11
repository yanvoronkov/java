package Stepic;

import java.util.Scanner;

public class Task11312 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = l; i <= r; i++) {
            sum+=array[i];
            count++;
        }

        System.out.println(sum/count);


    }
}

