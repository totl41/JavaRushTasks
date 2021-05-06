package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        Map<String, Double> map = new TreeMap<String, Double>(String.CASE_INSENSITIVE_ORDER);

        while (reader.ready()){
            String readerLine = reader.readLine();
            String name = readerLine.split(" ")[0];
            Double sum = Double.parseDouble(readerLine.split(" ")[1]);

            if (map.get(name) == null) map.put(name, sum);
            else {
                map.replace(name, map.getOrDefault(name, 0.0) + sum);
            }
        }

        reader.close();

        for (Map.Entry<String, Double> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
