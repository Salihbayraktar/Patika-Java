package KosulluIfadeler;

import java.util.Scanner;

public class UcakBiletiFiyati {

    public static void main(String[] args) {

        float pricePerKm = 0.10f;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Mesafeyi KM türünden giriniz : ");
            int km = scanner.nextInt();
            System.out.println("Lütfen yaşınızı giriniz : ");
            int age = scanner.nextInt();
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
            int type = scanner.nextInt();

            if (km > 0 && age > 0 && (type == 1 || type == 2)) {

                float price = pricePerKm * km;
                if (age < 12) price *= 0.5;
                else if (age < 24) price *= 0.9;
                else if (age > 65) price *= 0.7;

                if (type == 2) price *= 0.8 * 2;

                System.out.printf("Toplam Tutar = %.2f TL", price);
                break;
            } else System.out.println("Hatalı veri girdiniz...\n");

        }

    }
}
