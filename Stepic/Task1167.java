package Stepic;

import java.util.Scanner;

public class Task1167 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();
        boolean flag = true;
        String[] arr = ipAddress.split("\\.");

        if (ipAddress.length() <= 15 && (arr.length) == 4) {
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) > 255) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}


