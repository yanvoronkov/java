package Stepic;

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class Test {
    public static void main(String[] args) {

        String str = "Example string with a lot of a's";
        char searchChar = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(searchChar)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + searchChar + "' in the string: " + count);

    }
}


