package Donguler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class UsluSayi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ussu alınacak sayıyı giriniz :");
        int number = scanner.nextInt();

        System.out.println("Lutfen hesaplamak istediginiz kuvvetin degerini giriniz : ");
        int pow = scanner.nextInt();

        System.out.println("Sayının üstü : " +
                IntStream.range(0, pow)
                        .reduce(1, (result, i) -> result *= number));

    }
}
