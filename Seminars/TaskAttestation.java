package Seminars;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class TaskAttestation {
    /*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     */
    public static void main(String[] args) {

        int[] ramSize = {8, 16, 32, 64, 128, 256, 512, 1024, 2048};
        int[] hdSize = {500, 1000, 2000, 4000, 8000, 16000};
        String[] operatingSystem = {"Windows", "Linux", "MacOS"};
        String[] color = {"Black", "Silver", "Blue", "Red"};

        List<NoteBook> pc = new NoteBook().getRandomNoteBookCollection(ramSize, hdSize, operatingSystem, color,100);

        Set<NoteBook> noteBooks = new HashSet<>(pc);
        for (NoteBook s: noteBooks) {
            System.out.println(s);
        }

        System.out.println("===================");

        HashMap <Integer, String> userInput = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите минимальное значение RAM, Мб: ");
        userInput.put(1, scanner.nextLine());
        System.out.println("Введите размер жесткого диска, Гб: ");
        userInput.put(2, scanner.nextLine());
        System.out.println("Введите ОС (Windows, Linux, MacOS)");
        userInput.put(3, scanner.nextLine());
        System.out.println("Введите цвет (Black, Silver, Blue, Red)");
        userInput.put(4, scanner.nextLine());

        for (NoteBook s: noteBooks) {
            if (s.getRamSize() >= Integer.parseInt(userInput.get(1)) &&
                    s.getHddCapacity() >= Integer.parseInt(userInput.get(2)) &&
                    s.getOperatingSystem().equalsIgnoreCase(userInput.get(3)) &&
                    s.getColor().equalsIgnoreCase((userInput.get(4)))) {
                System.out.println(s);
            } else {
                System.out.println("Такого устройства нет, уточните параметры!");
                break;

            }
        }

    }
}
