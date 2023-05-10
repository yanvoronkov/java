package Stepic;

import java.util.Scanner;

public class Task1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i*i;
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}

