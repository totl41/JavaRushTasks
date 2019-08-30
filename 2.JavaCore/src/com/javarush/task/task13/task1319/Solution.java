package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isEnd = false;
        String stringData = null;
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(reader.readLine()));

        while (!isEnd){
            stringData = reader.readLine();
            dos.writeUTF(stringData);
            if (stringData == "exit") isEnd = true;
        }

        dos.close();
    }
}
