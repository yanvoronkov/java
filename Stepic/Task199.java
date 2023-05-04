package Stepic;

import java.util.Scanner;

public class Task199 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int pr = 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            pr *= a;
            sum += pr;
        }
        res = 1 + sum;
        System.out.println(res);
        }

    }
