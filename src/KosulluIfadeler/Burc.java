package KosulluIfadeler;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Burc {

    public static void main(String[] args) {

        Map<LocalDate, String> horoscope = new LinkedHashMap<>();

        horoscope.put(LocalDate.of(2021, 1, 21), "Oglak");
        horoscope.put(LocalDate.of(2021, 2, 19), "Kova");
        horoscope.put(LocalDate.of(2021, 3, 20), "Balik");
        horoscope.put(LocalDate.of(2021, 4, 20), "Koc");
        horoscope.put(LocalDate.of(2021, 5, 21), "Boga");
        horoscope.put(LocalDate.of(2021, 6, 22), "Ikizler");
        horoscope.put(LocalDate.of(2021, 7, 22), "Yengec");
        horoscope.put(LocalDate.of(2021, 8, 22), "Aslan");
        horoscope.put(LocalDate.of(2021, 9, 22), "Basak");
        horoscope.put(LocalDate.of(2021, 10, 22), "Terazi");
        horoscope.put(LocalDate.of(2021, 11, 21), "Akrep");
        horoscope.put(LocalDate.of(2021, 12, 21), "Yay");
        horoscope.put(LocalDate.of(2021, 12, 31), "Oglak");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz :");
        int month = scanner.nextInt();
        System.out.println("Doğduğunuz günü giriniz :");
        int day = scanner.nextInt();

        LocalDate birthDay = LocalDate.of(2021, month, day);

        for (Map.Entry<LocalDate, String> sign : horoscope.entrySet()) {

            if (birthDay.isBefore(sign.getKey()) || birthDay.equals(sign.getKey())) {

                System.out.printf("Burcunuz %s", sign.getValue());
                break;
            }
        }

    }

}
