package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int oldData = 0;

        while (inputStream.available() > 0){
            int newData = inputStream.read();
            if (oldData < newData) oldData = newData;
        }
        inputStream.close();
        System.out.println(oldData);
    }
}
