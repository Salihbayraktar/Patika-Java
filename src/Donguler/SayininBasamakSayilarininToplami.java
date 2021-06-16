package Donguler;

import java.util.Scanner;

public class SayininBasamakSayilarininToplami {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sumOfDigits = 0;

        while (number != 0) {

            sumOfDigits += number % 10;
            number = number / 10;

        }

        System.out.println("Basamak sayılarının toplamı : " + sumOfDigits);

    }

}
