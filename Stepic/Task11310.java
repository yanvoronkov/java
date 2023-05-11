package Stepic;

import java.util.Scanner;

public class Task11310 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (k == array[i]) {
                count++;
            }
        }
        System.out.println(count);


    }
}

