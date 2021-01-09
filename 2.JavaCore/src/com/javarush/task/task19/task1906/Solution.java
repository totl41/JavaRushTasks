package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(bufferedReader.readLine());
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());

        bufferedReader.close();

        for (int i = 1; fileReader.ready() ; i++) {
            int data = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(data);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
