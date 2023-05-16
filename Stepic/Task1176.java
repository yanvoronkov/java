package Stepic;

import java.util.Scanner;


public class Task1176 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] arr = str.split(" ");
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxCount) {
                maxCount = arr[i].length();
            }
        }
        System.out.println(maxCount);

    }
}


