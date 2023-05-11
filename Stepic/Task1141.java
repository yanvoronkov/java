package Stepic;

import java.util.Scanner;

public class Task1141 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr1 = new double[n];
        double [] arr2 = new double[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i] + arr2[i]);
        }


    }
}

