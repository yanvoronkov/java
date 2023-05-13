package Stepic;

import java.util.Scanner;

public class Task1163 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ingredient1 = scanner.nextLine();
        String ingredient2 = scanner.nextLine();
        String receipt = scanner.nextLine();
        System.out.println(receipt.replace(ingredient1,ingredient2));


    }
}


