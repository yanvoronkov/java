package Stepic;

import java.util.Scanner;

public class Task1165 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String letterMasha = scanner.nextLine();
        String letterOleg = scanner.nextLine();
        String post = scanner.nextLine();
        String arr[] = post.split(" ");
        int countWordsMasha = 0;
        int countWordsOleg = 0;
        for (String word : arr) {
            if (word.toLowerCase().startsWith(letterMasha) && word.toLowerCase().endsWith(letterOleg)) {
                countWordsMasha++;
            } else if (word.toLowerCase().startsWith(letterOleg) && word.toLowerCase().endsWith(letterMasha)) {
                countWordsOleg++;
            }

        }
        System.out.println(countWordsMasha);
        System.out.println(countWordsOleg);


    }
}


