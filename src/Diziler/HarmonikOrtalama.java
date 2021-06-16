package Diziler;

import java.util.Arrays;

public class HarmonikOrtalama {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        double harmonicSeries = Arrays.stream(numbers).mapToDouble(i -> 1.0 / i).sum();

        System.out.println("Harmonik Ortalama : " + (numbers.length / harmonicSeries));
    }

}
