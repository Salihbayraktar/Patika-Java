package KosulluIfadeler;

import java.util.Scanner;

public class HavaSicakligi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık degerini giriniz : ");
        int heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz...");
        } else if (heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz...");
        } else if (heat < 15) {
            System.out.println("Sinemaya veya piknige gidebilirsiniz...");
        } else if (heat < 25) {
            System.out.println("Piknige gidebilirsiniz...");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz...");
        }

    }
}
