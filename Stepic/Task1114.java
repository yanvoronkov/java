package Stepic;

import java.util.Scanner;

public class Task1114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alex = sc.nextInt();
        int brother = sc.nextInt();
        int count = 2020;
        while (brother-alex>alex){// пока разница в возрасте брата и алекса больше, чем возраст алекса
            brother++;
            alex++;
            count++;}
        if (brother-alex==alex)
            System.out.println(count);
        else System.out.println("Никогда");

    }
}