package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());

        int numberBits = file1.available();

        if (numberBits % 2 == 0){

            byte[] buffer = new byte[numberBits / 2];

            int count = file1.read(buffer);
            file2.write(buffer, 0, count);

            count = file1.read(buffer);
            file3.write(buffer, 0, count);
        }
        else {
            byte[] buffer = new byte[(numberBits + 1) / 2];
            int count = file1.read(buffer);
            file2.write(buffer, 0, count);

            buffer = new byte[file1.available()];
            count = file1.read(buffer);
            file3.write(buffer, 0, count);
        }
        file1.close();
        file2.close();
        file3.close();
    }
}
