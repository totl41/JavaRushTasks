package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        //String[] args1 = new String[]{"-d", "d:\\Development\\task1818_2.txt", "d:\\Development\\task1818_1.txt"};

        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        byte[] key = new byte[]{1, 2, 3, 4, 5};

        if (args[0].equals("e")) {
            //encrypt
            while (fileInputStream.available() > 0) {
                byte[] buff = new byte[fileInputStream.available()];
                fileInputStream.read(buff);

                int j = 0;
                for (int i = 0; i < buff.length; i++) {
                    buff[i] = (byte) (buff[i] ^ key[j]);
                    if (j > key.length) j = 0;

                }
                fileOutputStream.write(buff);
            }
        } else {
            //decipher
            while (fileInputStream.available() > 0) {
                byte[] buff = new byte[fileInputStream.available()];
                fileInputStream.read(buff);

                int j = 0;
                for (int i = 0; i < buff.length; i++) {
                    buff[i] = (byte) (buff[i] ^ key[j]);
                    if (j > key.length) j = 0;

                }
                fileOutputStream.write(buff);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
