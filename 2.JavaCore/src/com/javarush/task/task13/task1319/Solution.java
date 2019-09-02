package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        boolean isEnd = false;
        String stringData = null;

        while (!isEnd){
            stringData = reader.readLine();

            if (stringData.equals("exit")) {
                writer.write(stringData);
                isEnd = true;
            }
            else writer.write(stringData + "\r\n");
        }
        reader.close();
        writer.close();
    }
}
