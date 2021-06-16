package Donguler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GirilenSayiyaKadar12YeBolunenSayilarinOrt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "0 dan girilen sayıya kadar olan, 3 ve 4 e tam bölünebilen sayıların ortalaması : " +
                        IntStream.range(1, (scanner.nextInt() / 12) + 1)
                                .map(i -> i * 12)
                                .average()
                                .orElse(-1)
        );
    }
}
