package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);

        String stringWriter = "";

        while (reader.ready()){

            String[] strings = reader.readLine().split(" ");

            for (int i = 0; i < strings.length; i++) {

                if (!strings[i].replaceAll("\\d", "").equals(strings[i])){

                    stringWriter = stringWriter + " " + strings[i];
                }
            }
        }
        reader.close();
        writer.write(stringWriter.trim());
        writer.close();
    }
}
