package Stepic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        StringBuilder output = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String newLine = line.trim().replaceAll("\\s+", " ");
            output.append(newLine).append("\n");
        }
        System.out.println("Текст с удаленными лишними пробелами:");
        System.out.println(output.toString());



    }
}


