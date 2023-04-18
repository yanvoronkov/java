// Task1_3
// В первый день спортсмен пробежал x километров, а затем он
// каждый день увеличивал пробег на 10% от предыдущего значения.
// По данному числу y определите номер дня, на который пробег 
// спортсмена составит не менее y километров.
// Входные данные
// Программа получает на вход действительные числа x и y
// Выходные данные
// Программа должна вывести одно натуральное число.
// Sample Input:
// 10
// 20
// Sample Output:
// 9

package Seminars;

import java.util.Scanner;

public class Task1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите кол-во км , которые спортсмен пробежал в первый день : ");
		double first_day_km = in.nextDouble();
		System.out.print("Введите сколько он пробежал в итоге : ");
		double final_km = in.nextDouble();
		in.close();
		int day_number = 1;
		while (final_km >= first_day_km) {
			day_number += 1;
			first_day_km *= 1.1;
		}
		System.out.println(day_number);
	}
}
