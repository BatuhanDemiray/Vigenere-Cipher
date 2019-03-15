package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                /* Vigenere Cipher */
        Scanner scan = new Scanner(System.in);
        Cipher cph = new Cipher();

        System.out.print("Şifrelenecek Kelimeyi Giriniz: ");
        String encrypt = scan.next();
        System.out.print("Keyi Giriniz: ");
        String key = scan.next();
        
        String encryptedMessage = cph.encrypt(cph.toUpperString(encrypt), cph.toUpperString(key));
        cph.decrypt(cph.toUpperString(encryptedMessage), cph.toUpperString(key));

}
}
