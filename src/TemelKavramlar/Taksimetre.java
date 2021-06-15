package TemelKavramlar;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int payment = 10;
        float pricePerKm = 2.20f;

        System.out.print("Mesafeyi KM cinsinden giriniz : ");

        int totalKm = scanner.nextInt();

        payment += totalKm * pricePerKm;

        System.out.println("Ödenecek Tutar : " + Math.max(payment, 20));


    }

}
