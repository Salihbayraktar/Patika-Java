package KosulluIfadeler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class KucuktenBuyugeSirala {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IntStream.range(0, 3).map(i -> {
            System.out.printf("%d sayiyi giriniz : ", i + 1);
            return scanner.nextInt();
        }).sorted()
                .forEach(System.out::println);

    }
}
