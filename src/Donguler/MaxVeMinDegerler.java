package Donguler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MaxVeMinDegerler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç tane sayi gireceksiniz : ");
        int length = scanner.nextInt();

        int[] numbers = IntStream.range(0, length).map(i -> {
            System.out.printf("%d. sayiyi giriniz : ", i + 1);
            return scanner.nextInt();
        }).toArray();

        System.out.println("En büyük sayi : " + Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE));
        System.out.println("En küçük sayi : " + Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE));

    }

}
