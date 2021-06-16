package KosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("Ikıncı sayıyı giriniz : ");
        int number2 = scanner.nextInt();

        System.out.println("""
                1 Toplama\s
                2 Cıkarma\s
                3 Carpma\s
                4 Bolme""");
        int process = scanner.nextInt();

        switch (process) {
            case 1 -> System.out.println("Toplam : " + (number1 + number2));
            case 2 -> System.out.println("Fark : " + (number1 - number2));
            case 3 -> System.out.println("Carpım : " + (number1 * number2));
            case 4 -> System.out.println("Bolum : " + ((float) number1 / number2));
            default -> System.out.println("Geçersiz işlem girdiniz...");
        }

    }

}
