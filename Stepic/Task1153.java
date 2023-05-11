package Stepic;

import java.util.Scanner;

public class Task1153 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            array [i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (array[i] > 0 && array[i+1]>0 || array[i] < 0 && array[i+1]<0) {
                flag = true;
            }

        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}


