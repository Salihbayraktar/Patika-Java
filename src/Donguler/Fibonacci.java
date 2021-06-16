package Donguler;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int length) {
        if (length == 0) return 0;
        else if (length == 1) return 1;

        return fibonacci(length - 1) + fibonacci(length - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisinin eleman sayisini giriniz : ");
        System.out.println(fibonacci(scanner.nextInt()));
    }

}
