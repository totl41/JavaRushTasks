package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()));

        bufferedReader.close();

        StringBuilder builder = new StringBuilder();

        while (reader.ready()){
            builder.append((char)reader.read());
        }

        String[] temp = builder.toString().split(" ");

        for (String aTemp : temp) {
            if (aTemp.matches("[0-9]+"))
                writer.write(aTemp + " ");
        }


        reader.close();
        writer.close();
    }
}
