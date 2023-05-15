package Stepic;

import java.util.Scanner;

public class Task1172 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char letter = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(letter)) {
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


