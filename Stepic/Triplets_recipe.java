package Stepic;

import java.util.Scanner;

public class Triplets_recipe {
    public static void main(String[] args) {


        // рецепт тройчатки:
        // 1 часть полыни;
        // 1,5 части расторопши;
        // 2 части гвоздики;
        // 4 части пижмы;

        Scanner sc = new Scanner(System.in);
        double sagebrush = 0, milkThistle = 0, carnation = 0, tansy = 0;

        System.out.println("Введите цифру ингридиента (Полынь - 1, Расторопша - 2, Гвоздика - 3, Пижма - 4): ");
        int numIngredient = sc.nextInt();

        System.out.println("Введите количество ингридиента, г: ");
        double quantityIngredient = sc.nextDouble();


        if (numIngredient == 1) {
            sagebrush = quantityIngredient;
            milkThistle = quantityIngredient * 1.5;
            carnation = quantityIngredient * 2;
            tansy = quantityIngredient * 4;
        } else if (numIngredient == 2) {
            sagebrush = quantityIngredient / 1.5;
            milkThistle = quantityIngredient;
            carnation = 2 * quantityIngredient / 1.5;
            tansy = 4 * quantityIngredient / 1.5;
        } else if (numIngredient == 3) {
            sagebrush = quantityIngredient / 2;
            milkThistle = 1.5 * quantityIngredient / 2;
            carnation = quantityIngredient;
            tansy = quantityIngredient * 2;
        } else {
            sagebrush = quantityIngredient / 4;
            milkThistle = 1.5 * quantityIngredient / 4;
            carnation = quantityIngredient / 2;
            tansy = quantityIngredient;
        }



        System.out.println("Рецепт тройчатки: ");
        System.out.println("- полыни: " + sagebrush + " г");
        System.out.println("- расторопши: " + milkThistle + " г");
        System.out.println("- гвоздики: " + carnation + " г");
        System.out.println("- пижмы: " + tansy + " г");

    }
}


