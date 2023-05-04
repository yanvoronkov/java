package Stepic;

import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        for (int i = n; n !=0 ; n/=2) {
            res += n % 2;
        }
        System.out.println(res);

    }
}