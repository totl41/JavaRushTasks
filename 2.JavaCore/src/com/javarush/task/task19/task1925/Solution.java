package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String result = "";
        while (reader.ready()){

            String[] outString = reader.readLine().split(" ");

            for (int i = 0; i < outString.length; i++) {

                if (outString[i].length() > 6){
                    result = result + (result.length() == 0 ? "" : ",") + outString[i];
                }
            }
        }
        writer.write(result);
        reader.close();
        writer.close();
    }
}
