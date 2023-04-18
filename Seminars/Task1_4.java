// Task1_4
// Вводится натуральное число n. Вычислите n! ("эн-факториал")
//  – произведение всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120

package Seminars;

import java.util.Scanner;

public class Task1_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите число n факториала : ");
		int number = in.nextInt();
		in.close();
		int result = 1;
		for (int i = 2; i <= number; i++) {
			result *= i;
		}
		System.out.printf("Факториал числа %d = %d\n", number, result);
	}
}