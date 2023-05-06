package Stepic;

import java.util.Scanner;

public class Task1121 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int [] a = new int[n];
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = (i+1)*(i+1)*(i+1);
        }
        System.out.println(a[b-1]);
        System.out.println(a[c-1]);

    }
}