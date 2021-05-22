package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        while (scanner.hasNextLine()){
            String stringOut = scanner.nextLine();

            for (Map.Entry<Integer, String> pair:map.entrySet()) {

                if (stringOut.matches(".*\\b[0123456789(10)(11)(12)]\\b.*")) {
                    for (Map.Entry<Integer, String> item : map.entrySet()) {
                        String regex = String.format("\\b%s\\b", item.getKey());
                        stringOut = stringOut.replaceAll(regex, item.getValue());
                    }
                }
            }
            System.out.println(stringOut);
        }
        scanner.close();
    }
}
