package Stepic;

import java.util.Scanner;

public class Task1129 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        boolean[] knockedDown = new boolean[n];

        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;

            for (int j = a; j <= b; j++) {
                knockedDown[j] = true;
            }
        }

//        for (boolean isKnockedDown : knockedDown) {
//            System.out.print(isKnockedDown ? "." : "I");
//        }
        for (int i = 0; i < knockedDown.length; i++) {
            System.out.print(knockedDown[i] == true ? "." : "I");
        }

    }
}

