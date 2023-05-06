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

import java.util.*;

public class Task2_7 {
//	На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки
//	книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
//	Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия
//	и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
//	название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену,
//	не встречаются изначально в тексте.
//
//	Выходные данные
//	Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание.
//	ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться
//	с большой буквы!
//
//	Sample Input:
//
//	2
//	Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис
//	на мороженое.
//	Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
//	3
//	арахис - колбаса
//	клубника - вишня
//	сгущенка - молоко

//	Sample Output:
//
//	Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса
//	на мороженое.
//	Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// читаем количество строк
		int n = scanner.nextInt();
		scanner.nextLine();

		// читаем строки книги
		List<String> book = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			book.add(scanner.nextLine());
		}

		// читаем количество аллергенов и правила замены
		int m = scanner.nextInt();
		scanner.nextLine();
		Map<String, String> replacements = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String[] rule = scanner.nextLine().split(" - ");
			replacements.put(rule[0], rule[1]);
		}

		// заменяем продукты в строках книги и выводим их
		for (String line : book) {
			String[] words = line.split(" ");
			StringBuilder sb = new StringBuilder();
			for (String word : words) {
				if (replacements.containsKey(word.toLowerCase())) {
					String replacement = replacements.get(word.toLowerCase());
					if (Character.isUpperCase(word.charAt(0))) {
						replacement = replacement.substring(0, 1).toUpperCase() + replacement.substring(1);
					}
					sb.append(replacement);
				} else {
					sb.append(word);
				}
				sb.append(" ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
