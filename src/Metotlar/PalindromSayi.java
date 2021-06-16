package Metotlar;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromSayi {

    private static boolean isPalindrome(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length / 2; i++) {
            if (numbers[i] != numbers[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sayiyi giriniz.");
        String number = scanner.nextLine();

        int[] digits = IntStream.range(0, number.length())
                .map(i -> i = Character.getNumericValue(number.charAt(i)))
                .toArray();

        System.out.println(isPalindrome(digits));

    }

}
