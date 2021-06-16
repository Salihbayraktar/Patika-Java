package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetod {

    static void recursionDesen(int n, int value, int jump) {

        if (value > n) return;
        if (value <= 0) jump *= -1;

        System.out.println(value + " ");
        recursionDesen(n, value - jump, jump);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N sayisini giriniz :");
        int n = scanner.nextInt();

        System.out.println("Desenin atlama miktarını giriniz :");
        int jump = scanner.nextInt();

        recursionDesen(n, n, jump);
    }

}
