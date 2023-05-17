package Stepic;

import java.util.Arrays;
import java.util.Scanner;


public class Task1178 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i] == '0' || a[i] == '6' || a[i] == '9') count++;
            if (a[i] == '8') count=count+2;
        }
        System.out.println(count);
        

    }
}


