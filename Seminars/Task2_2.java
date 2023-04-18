// Task2_2

// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега.
// Затем вводится строка, в которой перечислены слова, которые написаны в газете.
// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй
// - сколько слов выписал Олег.
// Sample Input:
// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:
// 7
// 5
package Seminars;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String masha = scanner.next();
			String oleg = scanner.next();
			String words = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
			String[] words_out = words.split(" ");
			int count1 = 0, count2 = 0;
			for (String word : words_out) {
				if (word.contains(masha))
					count1++;
				if (word.contains(oleg))
					count2++;
			}
			System.out.print(count1 + ", " + count2);
		}
	}
}

// Еще один вариант решения

// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);

// System.out.print("Введите фразу: ");
// String phrase = scanner.nextLine(); // вводим фразу с клавиатуры

// System.out.print("Введите букву Маши: ");
// char letter1 = scanner.next().charAt(0); // вводим букву с клавиатуры

// System.out.print("Введите букву Олега: ");
// char letter2 = scanner.next().charAt(0); // вводим букву с клавиатуры

// int count1 = 0; // счетчик слов, содержащих букву
// int count2 = 0; // счетчик слов, содержащих букву

// String[] words = phrase.split("\\s+"); // разбиваем фразу на слова

// // проходим по каждому слову в массиве
// for (String word : words) {
// // если слово содержит заданную букву, увеличиваем счетчик
// if (word.indexOf(letter1) != -1) {
// count1++;
// }
// if (word.indexOf(letter2) != -1) {
// count2++;
// }
// }

// // выводим результат
// System.out.println(count1);
// System.out.println(count2);

// scanner.close();
// }