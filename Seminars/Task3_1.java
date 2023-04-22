// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

package Seminars;

import java.security.DrbgParameters.Capability;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task3_1 {
	public static void main(String[] args) {
		ex1();

	}

	static void ex0() {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = s1;
		String s4 = "h" + "e" + "l" + "l" + "o";
		String s5 = new String("hello");
		String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

		System.out.println(s5 == s6);
	}

	static void ex1() {
		// Заполнить список десятью случайными числами.
		// Отсортировать список методом sort() и вывести его на экран.
		List<Integer> list = createList(10, 4, 10);
		System.out.println(list);
		sort(list);
		System.out.println(list);
		sortReverse(list);
		System.out.println(list);
	}

	static void sort(List<Integer> list) {
		Collections.sort(list);
	}

	static void sortReverse(List<Integer> list) {
		Collections.sort(list, Comparator.reverseOrder());
	}

	static List<Integer> createList(int capacity, int max, int min) {
		List<Integer> result = new ArrayList<>(capacity);
		for (int i = 0; i < capacity; i++) {
			result.add((int) (Math.random() * (max - min + 1) + min));
		}
		return result;
	}
}