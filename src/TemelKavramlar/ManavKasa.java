package TemelKavramlar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Float> products = new LinkedHashMap<>();
        products.put("Armut", 2.14f);
        products.put("Elma", 3.67f);
        products.put("Domates", 1.11f);
        products.put("Muz", 0.95f);
        products.put("Patlıcan", 5f);

        float totalPrice = 0;
        for (Map.Entry<String, Float> product : products.entrySet()) {
            System.out.printf("%s Kaç Kilo ? :", product.getKey());
            int amount = scanner.nextInt();
            totalPrice += (amount * product.getValue());
        }

        System.out.printf("Toplam Tutar : %.2f TL ", totalPrice);

    }

}
