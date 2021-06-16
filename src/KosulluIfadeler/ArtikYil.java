package KosulluIfadeler;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yil Giriniz : ");
        int year = scanner.nextInt();

        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.printf("%d bir artik yildir !", year);
        } else {
            System.out.printf("%d bir artik yil degildir !", year);
        }
    }
}
