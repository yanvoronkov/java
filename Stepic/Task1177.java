package Stepic;

import java.util.Arrays;
import java.util.Scanner;


public class Task1177 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char [] arr = scanner.nextLine().toLowerCase().replaceAll(" ", "").toCharArray();
        Arrays.sort(arr);
        int maxFrequency = 0;
        char letter = ' ';
        char maxFrequencyLetter = ' ';
        for (char i : arr) {
            int frequency = 0;
            for (char j : arr) {
                if (i == j) {
                    frequency++;
                    letter = i;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyLetter = i;
                
            }

        }
        System.out.println(maxFrequencyLetter + " " + maxFrequency);
        

    }
}


