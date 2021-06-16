package Donguler;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int drawStar = number * 2 + 1;

        int addSpace = 0;
        for (int i = drawStar; i >= 0; i -= 2) {

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
