// Task2_4

// Вводится строчка текста, затем, на следующей строке,
// одна буква латинского алфавита. Найдите, сколько раз в
// тексте встречается введённый символ в любом регистре. Учтите, что цифры не
// имеют разницы в записи нижнего и верхнего регистров.

// Sample Input:
// Good morning my dear friend. My fish.
// m
// Sample Output:
// 3
package Seminars;

import java.util.Scanner;

public class Task2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine().toLowerCase();
		String alpha = scanner.nextLine().toLowerCase();
		int count = 0;
		char[] text_out = text.toCharArray();
		for (char symbol : text_out) {
			if (symbol == alpha.charAt(0))
				count++;
		}
		System.out.println(count);
		scanner.close();
	}
}
