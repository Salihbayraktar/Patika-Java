package Donguler;

import java.util.Scanner;

public class YildizlarIleElmas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        int number = scanner.nextInt();

        int drawStar = number * 2 + 1;

        int addSpace = number;

        // First half of the diamond
        for (int i = 1; i <= drawStar; i += 2) {

            for (int k = 0; k < addSpace; k++) {
                System.out.print(" ");
            }
            addSpace--;

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half of the diamond
        addSpace = 1;
        for (int i = drawStar - 2; i >= 0; i -= 2) {

            for (int k = 0; k < addSpace; k++) {
                System.out.print(" ");
            }
            addSpace++;

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
