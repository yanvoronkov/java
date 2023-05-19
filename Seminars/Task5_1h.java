package Seminars;


import java.util.Locale;
import java.util.Scanner;

public class Task5_1h<T> {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
		что 1 человек может иметь несколько телефонов. Нужны методы добавления
		новой записи в книгу и метод поиска записей в телефонной книге
		 */

		Phones phoneBook = new Phones();
		phoneBook.add("Иванов", "89111111111");
		phoneBook.add("Васильев", "89112222222");
		phoneBook.add("Сидоров", "89133333333");

		System.out.println("Введите имя: ");
		String item = phoneBook.find(scanner.nextLine());

		if (item == null) {
			System.out.println("Такого имени нет!");
		} else {
            System.out.println("Искомый номер: " + item);
        }


	}
}
