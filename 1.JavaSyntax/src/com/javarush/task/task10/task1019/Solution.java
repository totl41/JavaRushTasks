package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> stringMap = new HashMap<String, Integer>();

        while (true){
            String stringNumber = reader.readLine();
            if (stringNumber.isEmpty()) break;
            String stringString = reader.readLine();
            stringMap.put(stringString, Integer.parseInt(stringNumber));
            if (stringString.isEmpty()) break;
        }

        for (HashMap.Entry<String, Integer> pair: stringMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
