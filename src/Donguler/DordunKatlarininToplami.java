package Donguler;

import java.util.Scanner;

public class DordunKatlarininToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            number = scanner.nextInt();

            if (number % 4 == 0) sum += number;

        } while (number % 2 != 1);
        System.out.println("Girilen sayılardan 4 ün katı olanlarının toplamı : " + sum);

    }

}
