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

import java.util.HashMap;
import java.util.Map;

public class Task2_6 {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

	public static void main(String[] args) {
	String s = "abc";
	int[] index = {2, 1, 0};
	String shuffled = shuffleString(s, index);
	System.out.println(shuffled);
}

	static String shuffleString(String s, int[] index) {
	char[] shuffled = new char[s.length()];
	for (int i = 0; i < s.length(); i++) {
		shuffled[index[i]] = s.charAt(i);
	}
	return new String(shuffled);
}
}
