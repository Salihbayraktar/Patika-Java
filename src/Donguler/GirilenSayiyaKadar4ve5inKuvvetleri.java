package Donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar4ve5inKuvvetleri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fourPow = 1;
        int fivePow = 1;
        while (number >= (fourPow *= 4)) System.out.println("Dördün kuvveti : " + (fourPow));
        while (number >= (fivePow *= 5)) System.out.println("Besin kuvveti : " + (fivePow));
    }

}
