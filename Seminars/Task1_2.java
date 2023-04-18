// Task1_2
// Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
// Входные данные
// Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
// Выходные данные
// Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
// Sample Input 1:
// 3 2 4
// Sample Output 1:
// YES

package Seminars;

import java.util.Scanner;

public class Task1_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите n долек шоколадки: ");
		int n = in.nextInt();
		System.out.print("Введите m долек шоколадки: ");
		int m = in.nextInt();
		System.out.print("Введите число долек k: ");
		int k = in.nextInt();
		in.close();

		if (k < n * m & k % m == 0 || k % n == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
