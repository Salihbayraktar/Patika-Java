package Metotlar;

import java.util.Scanner;

public class AsalSayi {

    static boolean isAsal(int number, int variable) {
        if (variable == 1) return true;
        else if (number % variable == 0) return false;

        return isAsal(number, variable - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int number = scanner.nextInt();

        System.out.println(isAsal(number, number - 1) ? "Sayi asaldir." : "Sayi asal degildir.");
    }
}
