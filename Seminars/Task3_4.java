package Seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3_4 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 31, 1, 4, 10, 6, 17, 8, 9, 15));
		int maxValue = list.get(0);
		int minValue = list.get(0);
		double sum = 0;
		double average = 0;

		maxValue = Collections.max(list);
		minValue = Collections.min(list);

		for (Integer num : list) {
            sum += num;
        }

		average = sum / list.size();
		System.out.println("Min value: " + minValue);
		System.out.println("Max value: " + maxValue);
		System.out.println("Average: " + average);
	}
}
