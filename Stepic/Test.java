package Stepic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next(); //или даже nextLine(), без разницы
        System.out.println(a + " " + s);

    }
}


