//Реализовать простой калькулятор
//Минимум -- > Условия + Цикл
//Введите число
//Введите число
//Выберите операцию
//1 - сложить
//2 - умножить

package Seminars;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = in.nextInt();
        System.out.print("Введите число: ");
        int num2 = in.nextInt();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - сложить: ");
        System.out.println("2 - вычесть: ");
        System.out.println("3 - умножить: ");
        System.out.println("4 - делить: ");
        int operation = in.nextInt();
        double result = Calculation(num1, num2, operation);
        System.out.println("Результат равен: " + result);
    }

    static double Calculation(double num1, double num2, int operation) {
        double result = 0;
        if (operation == 1)
            result = num1 + num2;
        else if (operation == 2)
            result = num1 - num2;
        else if (operation == 3)
            result = num1 * num2;
        else
            result = num1 / num2;

        return result;
    }
}
