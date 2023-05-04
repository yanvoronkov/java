package Stepic;

import java.util.Scanner;

public class Task1911 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean is_0 = false;
        int count = 0;
        int countFind = 0;
        while (true){
            String a = sc.next();
            if (a.equalsIgnoreCase("ээээ") || a.equalsIgnoreCase("потом")){
                continue;
            }
            count++;
            if (a.equalsIgnoreCase("Куб")){
                is_0 = true;
                countFind = count;
            }
            if (a.equalsIgnoreCase("СТОП")) break;
        }
        if (is_0)
            System.out.println(countFind);
        else
            System.out.println("NO");

    }
}