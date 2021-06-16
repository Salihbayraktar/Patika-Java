package Diziler;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DizininElemanlariniSiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin Boyutu :");
        int n = scanner.nextInt();

        int[] array = IntStream.range(0, n).map(i -> {
            System.out.printf("%d. Elemani : ", i + 1);
            return scanner.nextInt();
        }).toArray();

        //array = Arrays.stream(array).sorted().toArray();

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println("Sıralama : " + Arrays.toString(array));


    }

}
