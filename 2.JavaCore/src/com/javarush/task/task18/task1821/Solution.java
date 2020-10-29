package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {

            int charS = 0;
            int ascii = 0;
            int index = 0;
            while ((charS = reader.read()) != -1) {
                ascii = charS;
                if (!map.containsKey(ascii)) {
                    map.put(ascii, 1);
                } else {
                    map.merge(ascii, 1, Integer::sum);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Integer, Integer> entrys : map.entrySet()){
            System.out.println((char) ((int)entrys.getKey()) + " " + entrys.getValue());
        }
    }
}
