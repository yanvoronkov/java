package Stepic;

import java.util.Scanner;

public class Task1171 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'f') {
                count++;
            }
        }
        System.out.println(count);

//        char [] arr = str.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 'f') {
//                count++;
//            }
//        }
//        System.out.println(count);


    }
}


