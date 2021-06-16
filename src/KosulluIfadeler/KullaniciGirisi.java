package KosulluIfadeler;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName = "Salih", password = "123";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz.");
        String inputName = scanner.nextLine();

        System.out.println("Sifrenizi giriniz.");
        String inputPassword = scanner.nextLine();

        while (true) {

            if (userName.equals(inputName) && password.equals(inputPassword)) {

                System.out.println("Başarıyla giriş yaptınız tebrikler.");
                System.exit(0);

            } else if (userName.equals(inputName)) {

                System.out.println("Yanlış şifre girdiniz şifrenizi sıfırlamak ister misiniz E/N");

                if ("E".equalsIgnoreCase(scanner.nextLine())) {

                    System.out.println("Yeni şifrenizi giriniz...");

                    String newPassword = scanner.nextLine();

                    if (newPassword.equals(password)) {

                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {

                        System.out.println("Şifre oluşturuldu");
                        password = newPassword;
                    }
                }

                System.out.println("Sifrenizi giriniz.");
                inputPassword = scanner.nextLine();

            } else {
                System.out.println("Yanlış kullanıcı adı ve şifre girdiniz.");

                System.out.println("Kullanıcı adınızı giriniz.");
                inputName = scanner.nextLine();

                System.out.println("Sifrenizi giriniz.");
                inputPassword = scanner.nextLine();
            }

        }
    }

}
