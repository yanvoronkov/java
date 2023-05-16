package Stepic;

import java.util.Scanner;




public class Task1175 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr1 = "";
        String newStr2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                newStr1 += str.charAt(i);
                newStr2 = str.charAt(i) + newStr2;
            }
        }
        if (newStr1.toLowerCase().equals(newStr2.toLowerCase())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}


