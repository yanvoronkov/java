package Stepic;

import java.util.Scanner;

public class Task1135 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<0 || a>n-1 || b>n-1 || b<0) {
            System.out.println("Error");
        } else {
            System.out.print(array[a] + array[b]);
        }

    }
}

