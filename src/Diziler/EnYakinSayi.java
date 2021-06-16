package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sayiyi giriniz.");

        int specialNumber = scanner.nextInt();

        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        int closestBigNumber = 0;
        int currBigDiff;
        int minBigDiff = Integer.MAX_VALUE;

        int closestSmallNumber = 0;
        int currSmallDiff;
        int minSmallDiff = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number >= specialNumber) {
                currBigDiff = number - specialNumber;
                if (currBigDiff < minBigDiff) {
                    minBigDiff = currBigDiff;
                    closestBigNumber = number;
                }
            }

            if (number <= specialNumber) {
                currSmallDiff = specialNumber - number;
                if (currSmallDiff < minSmallDiff) {
                    minSmallDiff = currSmallDiff;
                    closestSmallNumber = number;
                }
            }

        }
        System.out.println("En yakın küçük sayı : " + closestSmallNumber);
        System.out.println("En yakın büyük sayı : " + closestBigNumber);

    }

}
