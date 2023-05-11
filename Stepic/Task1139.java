package Stepic;

import java.util.Scanner;

public class Task1139 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag) System.out.println("Error");


    }
}

