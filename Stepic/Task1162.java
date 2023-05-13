package Stepic;

import java.util.Scanner;

public class Task1162 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 2));
        //first 5 chars
        System.out.println(str.substring(0, 5));
        //all except last 2 chars
        System.out.println(str.substring(0, str.length() - 2));
        System.out.println(str.substring(3, str.length()));
        System.out.println(str.length());






    }
}


