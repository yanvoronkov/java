package Seminars;

import java.util.Scanner;

public class Task1_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
