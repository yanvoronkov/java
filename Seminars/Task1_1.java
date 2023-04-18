// Task1_1

// Улитка ползёт по вертикальному шесту высотой h метров,
// поднимаясь за день на a метров, а за ночь спускаясь на b метров.
//  На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.

// Sample Input 1:
// 10
// 3
// 2
// Sample Output 1:
// 8

package Seminars;

import java.util.Scanner;

public class Task1_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите высоту столба для улитки : ");
		int hiegth = in.nextInt();
		System.out.print("Введите расстояние, котрое улитка проходит вверх : ");
		int up = in.nextInt();
		System.out.print("Введите расстояние, котрое улитка проходит вниз : ");
		int down = in.nextInt();
		in.close();
		int count = 0;
		while (true) {
			count += 1;
			hiegth -= up;
			if (hiegth <= 0) {
				break;
			}
			hiegth += down;
		}
		System.out.println(count);
	}
}