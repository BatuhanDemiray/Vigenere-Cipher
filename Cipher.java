package com.company;

public class Cipher {

    public String encrypt(String originalText, String key)
    {
        char[] textChar = new char[50];
        textChar = originalText.toCharArray();
        char[] keyChar = new char[50];
        keyChar = key.toCharArray();

        int i,j;
        int originalText_length = originalText.length();
        int key_length = key.length();
        char[] newKey = new char[originalText_length];
        char[] encrypted = new char[originalText_length];
        for (i = 0, j = 0; i < originalText_length; i++,j++)
        {
            if(j == key_length)
            {
                j=0;
            }
            newKey[i] = keyChar[j];
        }
        System.out.print("---ENCRYPTED--- \nKey: ");
        System.out.println(newKey);
        for (i = 0; i < originalText_length; i++)
        {
            encrypted[i] = (char) (((textChar[i] + newKey[i]) % 26 + 1) + 'A');
        }
        System.out.println("Orijinal Mesaj: " + String.valueOf(encrypted));
        //return String.valueOf(encrypted);
        return originalText;
    }

    public String toUpperString(String text)
    {
        String upperText = text.toUpperCase();
        return upperText;
    }

    public String decrypt(String encryptedText, String key)
    {
        char[] textChar = encryptedText.toCharArray();
        char[] keyChar = key.toCharArray();

        int i,j;
        int encryptedText_length = encryptedText.length();
        int key_length = key.length();

        char[] decrypted = new char[encryptedText_length];
        char[] newKey = new char[encryptedText_length];
        char[] encrypted = new char[encryptedText_length];

        for (i = 0, j = 0; i < encryptedText_length; i++,j++)
        {
            if(j == key_length)
            {
                j=0;
            }
            newKey[i] = keyChar[j];
        }
        System.out.print("---DECRYPTED--- \nKey: ");
        System.out.println(newKey);

        for (i = 0; i < encryptedText_length; i++)
        {
            encrypted[i] = (char) (((textChar[i] + newKey[i]) % 26 + 1) + 'A');
        }
        for (i = 0; i < encryptedText_length; ++i)
        {
            decrypted[i] = (char) ((((encrypted[i] - newKey[i]) + 26 - 1) % 26) + 'A');
        }
        System.out.println("Orijinal Mesaj: " + String.valueOf(decrypted));
        return encryptedText;
    }
}
