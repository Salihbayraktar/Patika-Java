package TemelKavramlar;

import java.util.Scanner;

public class DaireDilimininAlani {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        int r = scanner.nextInt();
        System.out.print("Merkez açısısının ölçüsünü giriniz : ");
        int a = scanner.nextInt();

        double areaOfSector = (Math.PI * (r * r) * a) / 360;

        System.out.println("Daire diliminin alanı : " + areaOfSector);
    }
}
