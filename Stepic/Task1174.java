package Stepic;

import java.util.Scanner;

public class Task1174 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);


    }
}


