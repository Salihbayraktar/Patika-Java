package TemelKavramlar;

import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        float kdv = quantity > 1000 ? 0.18f : 0.08f;

        System.out.println("KDV'siz fiyat : " + quantity);
        System.out.println("KDV'li fiyat : " + (quantity * kdv + quantity));
        System.out.println("KDV tutarı : " + (quantity * kdv));

    }
}
