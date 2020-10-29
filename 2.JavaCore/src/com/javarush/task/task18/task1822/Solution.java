package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        String line = reader1.readLine();
        int id = 0;
        String[] lineString;
        int idArgs = Integer.parseInt(args[0]);//Integer.parseInt("0401");

        while (line != null){
            lineString = line.split(" ");
            id = Integer.parseInt(lineString[0]);
            if (id == idArgs) break;
            line = reader1.readLine();
        }

        System.out.println(line);
        reader1.close();
    }
}
