package Stepic;

import java.util.Scanner;

public class Task1164 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        String separator = scanner.next();
        System.out.println(String.join(separator, arr));


    }
}


