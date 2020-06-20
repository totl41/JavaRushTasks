package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int numberOfCommas = 0;

        while (inputStream.available() > 0){
            if (inputStream.read() == 44) numberOfCommas ++;
        }

        inputStream.close();
        System.out.println(numberOfCommas);
    }
}
