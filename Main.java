package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Vigenere Cipher */
        Scanner scan = new Scanner(System.in);
        Cipher cph = new Cipher();

        // ----- MENU ----- //
        /*while(true) {
        System.out.println("1)Encrypt 2)Decrypt");
        System.out.print("Menü Seçiniz: ");
        int process = scan.nextInt();
        switch (process) {
            case 1:
                System.out.print("Şifrelenecek Kelimeyi Giriniz: ");
                String encrypt = scan.next();
                System.out.print("Keyi Giriniz: ");
                String key = scan.next();
                String encryptedMessage = cph.encrypt(cph.toUpperString(encrypt), cph.toUpperString(key));
                System.out.println(encryptedMessage);
                break;
            case 2:
                System.out.print("Şifreli Kelimeyi Giriniz: ");
                encrypt = scan.next();
                System.out.print("Keyi Giriniz: ");
                key = scan.next();
                cph.decrypt(cph.toUpperString(encrypt), cph.toUpperString(key));
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }*/
        System.out.print("Şifrelenecek Kelimeyi Giriniz: ");
        String encrypt = scan.next();
        System.out.print("Keyi Giriniz: ");
        String key = scan.next();
        String encryptedMessage = cph.encrypt(cph.toUpperString(encrypt), cph.toUpperString(key));
        cph.decrypt(cph.toUpperString(encryptedMessage), cph.toUpperString(key));

}
}
