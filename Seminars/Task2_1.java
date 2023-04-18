// Task2_1
// Дана строка, в которой через пробел перечислены цифры.
//  На следующей строке вводится цифра. Определите индексы 
//  первого и последнего её вхождения.
// Sample Input:
// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:
// 0
// 28

package Seminars;

import java.util.Scanner;

public class Task2_1 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Введите цифры через пробел: ");
			String text = scanner.nextLine();
			System.out.print("Введите искомую цифру: ");
			String n = scanner.next();
			System.out.println(text.indexOf(n));
			System.out.print(text.lastIndexOf(n));
		}
	}
}
