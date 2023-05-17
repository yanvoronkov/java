package Stepic;

import java.util.Scanner;


public class Task1179 {
    public static void main(String[] args) {

    } {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        String number = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                number += c;
            } else {
                if (!number.isEmpty()) {
                    int n = Integer.parseInt(number);
                    String binary = Integer.toBinaryString(n);
                    result += binary;
                    number = "";
                }
                result += c;
            }
        }
        if (!number.isEmpty()) {
            int n = Integer.parseInt(number);
            String binary = Integer.toBinaryString(n);
            result += binary;
        }
        System.out.println(result);

        

    }
}


