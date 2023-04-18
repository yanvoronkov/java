// Task2_3
// Для того чтобы выходить в Интернет, каждому компьютеру присваивается
// так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне
//  от 0 до 255, разделенных точками. В следующих трех строках показаны
//   три правильных IP-адреса:
// 127.0.0.0
// 192.168.0.01
// 255.00.255.255
// Напишите программу, которая определяет, является ли заданная строка
// правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая
// включает цифры и точки.
// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES,иначе NO.
// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку.
// Иначе говоря строчка кода:
// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. 
// Для корректного создания строки, содержащей точку используйте экранирование.
// String s = "\.";
// Sample Input 1:
// 192.168.1.2
// Sample Output 1:
// YES
// Sample Input 2:
// 192.11.690.0
// Sample Output 2:
// NO
// Sample Input 3:
// 67.67.67
// Sample Output 3:
// NO

package Seminars;

import java.util.Scanner;

public class Task2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ip = scanner.nextLine();
		String[] ip_out = ip.split("\\.");
		boolean flag = true;
		if (ip.length() > 15) {
			flag = false;
		}
		if (ip_out.length != 4) {
			flag = false;
		}
		for (String numb : ip_out) {
			if ((Integer.parseInt(numb) < 0) || (Integer.parseInt(numb) > 255))
				flag = false;
		}
		if (!flag)
			System.out.print("NO");
		else
			System.out.print("YES");
		scanner.close();
	}

}
