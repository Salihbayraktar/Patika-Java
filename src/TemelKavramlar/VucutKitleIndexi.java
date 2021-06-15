package TemelKavramlar;

import java.util.Scanner;

public class VucutKitleIndexi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        float height = scanner.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz : ");
        int weight = scanner.nextInt();

        float bms = (float) (weight / (Math.pow(height, 2)));
        System.out.println("Vücut Kitle İndeksiniz : " + bms);

    }

}
