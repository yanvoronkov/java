package Seminars;


import java.util.LinkedList;

public class Task5_1<T> {
	public static void main(String[] args) {

		/*
		Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации
		123456 Иванов
		321456 Васильев
		234561 Петрова
		234432 Иванов
		654321 Петрова
		345678 Иванов
		 */
		Passports passports = new Passports();
		passports.add("123456", "Иванов");
		passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
		passports.add("345678", "Иванов");

		System.out.println(passports.get("234561"));
		System.out.println();
		System.out.println(passports.getAll());

	}
}
