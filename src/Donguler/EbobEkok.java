package Donguler;

import java.util.Scanner;

public class EbobEkok {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Ikinci sayiyi giriniz : ");
        int secondNumber = scanner.nextInt();

        int ebob = Math.min(firstNumber, secondNumber);

        while (firstNumber % ebob != 0 || secondNumber % ebob != 0) ebob--;

        int ekok = (firstNumber * secondNumber) / ebob;

        System.out.println("Ebob = " + ebob);
        System.out.println("Ekok = " + ekok);

    }
}
