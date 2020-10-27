package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader =new FileReader(args[0]);

        int countSymbol = 0;
        int countSpace = 0;

        while (fileReader.ready()){
            char s = (char) fileReader.read();
            countSymbol ++;
            if (s == ' ') countSpace ++;
        }
        fileReader.close();
        double pp = Math.round(countSpace / (double) countSymbol * 10000)/100.0;
        System.out.println(String.format("%.2f", pp));

    }
}
