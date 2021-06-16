package Diziler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin Boyutu :");
        int n = scanner.nextInt();

        int[] array = IntStream.range(0, n).map(i -> {
            System.out.printf("%d. Elemani : ", i + 1);
            return scanner.nextInt();
        }).toArray();

        Map<Integer, Integer> countDuplicate = new HashMap<>();

        for (int number : array) {
            if (!countDuplicate.containsKey(number)) {
                countDuplicate.put(number, 1);
            } else {
                countDuplicate.replace(number, countDuplicate.get(number) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : countDuplicate.entrySet()) {
            System.out.printf("%d sayisi %d kere tekrar edildi.\n", entry.getKey(), entry.getValue());
        }


    }

}
