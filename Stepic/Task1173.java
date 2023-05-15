package Stepic;

import java.util.Scanner;

public class Task1173 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int countDigits = 0;
        int countLetters = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                countDigits++;
            } else if (Character.isLetter(str.charAt(i))) {
                countLetters++;
            }
        }
        if (countDigits > countLetters) {
            System.out.println("Digit");
        } else if (countDigits < countLetters) {
            System.out.println("Letter");
        } else {
            System.out.println("Equal");
        }



    }
}


