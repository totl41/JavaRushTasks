package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        bufferedReader.close();

        while (reader.ready()){

            String readerLine = reader.readLine();
            writer.write(readerLine.replaceAll("\\p{Punct}|\n", ""));
        }

        reader.close();
        writer.close();
    }
}
