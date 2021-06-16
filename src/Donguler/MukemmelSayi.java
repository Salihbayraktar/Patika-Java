package Donguler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayiyi giriniz : ");

        int number = scanner.nextInt();

        int divisionSum = IntStream.range(1, number).filter(i -> number % i == 0).sum();

        System.out.println(divisionSum == number ? "Sayı mukemmel sayidir" : "Sayı mukemmel sayi degildir.");

    }
}
