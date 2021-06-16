package Metotlar;

import java.util.Scanner;

public class UsluSayiHesabi {

    static int findPower(int number,int pow){
        if(pow == 1) return number;

        return number * findPower(number,pow-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        int number = scanner.nextInt();

        System.out.println("Üs değerini giriniz : ");
        int pow = scanner.nextInt();

        System.out.println("Cevap : " + findPower(number,pow));
    }
}
