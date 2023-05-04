package Stepic;

import java.util.Scanner;

public class Task1912 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        int countMax = 1;

        while (n != 0){
            n = sc.nextInt();
            if (n == max) {
                countMax++;
            }
            if (n > max) {
                max = n;
                countMax = 1;
            }
        }
        System.out.println(countMax);

    }
}