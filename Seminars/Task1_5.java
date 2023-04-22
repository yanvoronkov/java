//Task5
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//Перейти по ссылке, реализовать формулу на Java.

package Seminars;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.println(triangularNumberCalculation(n));

    }
    static int triangularNumberCalculation (int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
            System.out.println(result);
        }
        return result;
    }
}