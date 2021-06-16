package KosulluIfadeler;

import java.util.Arrays;
import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {

        String[] lessons = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        Scanner scanner = new Scanner(System.in);

        double average = Arrays.stream(lessons).mapToInt(lesson -> {
            System.out.printf("%s notunuz : ", lesson);
            int score = scanner.nextInt();
            return (score >= 0 && score <= 100) ? score : -1;
        }).filter(i -> i != -1)
                .average().orElse(-1);

        System.out.println("Ortalamanız : " + average);
        System.out.println(average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }

}
