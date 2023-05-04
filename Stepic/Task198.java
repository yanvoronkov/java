package Stepic;

import java.util.Scanner;

public class Task198 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int res = 1;
        boolean flag = false;
        for (String i = sc.next(); true; i = sc.next()) {
            if (i.equalsIgnoreCase("СТОП")) break;
            int n = Integer.parseInt(i);
            if (n != 0) {
                res *= n;
                flag = true;
            }
        }
        if (flag){
            System.out.println(res);
        } else {
            System.out.println("Не найдено");
        }

    }
}
