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
import java.util.Scanner;

public class Task2_5 {
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
	public static void main(String[] args) {


		String jewels = "aB";
		String stones = "aaaAbbbB";
		String result = countJewelsInStones(jewels, stones);
		System.out.println(result);  // выводит "a3B1"

	}

	static String countJewelsInStones(String jewels, String stones) {
		Map<Character, Integer> counts = new HashMap<>();
		for (char jewel : jewels.toCharArray()) {
			counts.put(jewel, 0);
		}
		for (char stone : stones.toCharArray()) {
			if (counts.containsKey(stone)) {
				counts.put(stone, counts.get(stone) + 1);
			}
		}
		StringBuilder result = new StringBuilder();
		for (char jewel : jewels.toCharArray()) {
			result.append(jewel);
			result.append(counts.get(jewel));
		}
		return result.toString();
	}
}
