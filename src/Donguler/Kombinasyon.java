package Donguler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Kombinasyon {

    public static int factorial(int number) {
        return IntStream.range(1, number + 1).reduce(1, (factorial, multiplier) -> factorial *= multiplier);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayısını giriniz : ");
        int n = scanner.nextInt();
        System.out.println("R sayısını giriniz : ");
        int r = scanner.nextInt();

        int c = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Kombinasyon : " + c);

    }

}
