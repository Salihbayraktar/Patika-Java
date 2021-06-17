package DigerKonular;

import java.util.Scanner;

public class PalindromikKelime {

    public static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Polindrome olup olmadıgını öğrenmek istediğiniz kelimeyi giriniz.");

        System.out.println(isPalindrome(scanner.nextLine().trim()));

    }

}
