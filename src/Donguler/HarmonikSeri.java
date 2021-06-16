package Donguler;

import java.util.Scanner;
import java.util.stream.IntStream;

public class HarmonikSeri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println("Harmonik Serisi " +

                IntStream.range(1, number + 1)
                        .mapToDouble(i -> i)
                        .reduce((harmony, element) -> harmony += 1 / element)
                        .orElse(-1)
        );

    }

}
