package Seminars;


import java.util.LinkedList;

public class Task4_3<T> {
	public static void main(String[] args) {

		//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(list);


	}
}
