package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int minData = 2147483647;

        while (inputStream.available() > 0){
            int currentDate = inputStream.read();
            if (currentDate < minData) minData = currentDate;
        }
        inputStream.close();
        System.out.println(minData);

    }
}
