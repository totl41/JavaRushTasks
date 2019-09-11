package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();

        try {
            InputStream inputStream = new FileInputStream(reader.readLine());
            while (inputStream.available() > 0) buffer.append((char) inputStream.read());
            inputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        StringTokenizer tokenizer = new StringTokenizer(buffer.toString(), "\t\n\r");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (tokenizer.hasMoreTokens()) arrayList.add(Integer.parseInt(tokenizer.nextToken()));

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) System.out.println(arrayList.get(i));
        }
    }
}
