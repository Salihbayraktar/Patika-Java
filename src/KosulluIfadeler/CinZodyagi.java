package KosulluIfadeler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {

        Map<Integer, String> zodiac = new HashMap<>();
        zodiac.put(0, "Maymun");
        zodiac.put(1, "Horoz");
        zodiac.put(2, "Kopek");
        zodiac.put(3, "Domuz");
        zodiac.put(4, "Fare");
        zodiac.put(5, "Okuz");
        zodiac.put(6, "Kaplan");
        zodiac.put(7, "Tavsan");
        zodiac.put(8, "Ejderha");
        zodiac.put(9, "Yılan");
        zodiac.put(10, "At");
        zodiac.put(11, "Koyun");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz : ");
        int birthYear = scanner.nextInt();

        System.out.printf("Cin Zodyagi Burcunuz %s", zodiac.get(birthYear % 12));


    }

}
