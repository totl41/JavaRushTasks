package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileString1 = reader.readLine();
        String fileString2 = reader.readLine();

        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileString1);
        FileInputStream fileInputStream2 = new FileInputStream(fileString2);

        byte[] f1 = new byte[fileInputStream1.available()];
        byte[] f2 = new byte[fileInputStream2.available()];

        fileInputStream1.read(f1);
        fileInputStream2.read(f2);

        fileInputStream1.close();
        fileInputStream2.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(f1.length + f2.length);
        byteArrayOutputStream.write(f2);
        byteArrayOutputStream.write(f1);

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileString1);

        fileOutputStream1.write(byteArrayOutputStream.toByteArray());
        fileOutputStream1.close();
    }
}
