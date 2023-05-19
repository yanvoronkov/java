package Seminars;

import java.util.*;

public class Task6_3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 10, "Василий Петрович", "Корнишрекс");
        Cat cat2 = new Cat("Мурзик", 8, "Иван", "Мейнкун");
        Cat cat3 = new Cat("Мурзик", 8, "Иван", "Мейнкун");
        Cat cat4 = new Cat("Василиса", 8, "Петр", "Неизвестна");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        System.out.println();
        for (Cat cat : cats) {
            if (cat.getAge() == 8) {
                System.out.println(cat);
            }
        }
    }
}