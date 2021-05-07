package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<String, Double>();


        while (reader.ready()){

            String readeLine = reader.readLine();
            String name = readeLine.split(" ")[0];
            Double sum = Double.valueOf(readeLine.split(" ")[1]);

            if (map.get(name) == null) map.put(name, sum);
            else map.replace(name, map.getOrDefault(name, 0.0) + sum);
        }
        reader.close();

        Double maxVolue = Double.MIN_VALUE;
        for (Double presentValue : map.values()){
            if (maxVolue < presentValue) maxVolue = presentValue;
        }

        for (Map.Entry<String, Double> pair : map.entrySet()){
            if (pair.getValue().equals(maxVolue)){
                System.out.println(pair.getKey());
            }
        }
    }
}
