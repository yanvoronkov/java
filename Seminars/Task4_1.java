package Seminars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task4_1 {
	public static void main(String[] args) {

		//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
		//Постараться не обращаться к листу по индексам.

		LinkedList<String> list = new LinkedList<>();
		list.add("Один");
		list.add("Два");
		list.add("Три");
		list.add("Четыре");
		list.add("Пять");

		LinkedList<String> reversedList = reverseList(list);

		for (String item : reversedList) {
			System.out.println(item);
		}
	}

	public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
		LinkedList<T> reversedList = new LinkedList<>();
		for (T item : list) {
			reversedList.addFirst(item);
		}
		return reversedList;
	}
}
