package Seminars;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_4 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		for (int i = 0; i < list.size(); i++){
			if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
		}
		System.out.println(list);

	}
}
