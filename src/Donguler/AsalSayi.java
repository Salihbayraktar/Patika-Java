package Donguler;

public class AsalSayi {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int divisorCount = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                    break;
                }
            }
            if (divisorCount == 0) System.out.print(i + " ");
        }
    }
}
