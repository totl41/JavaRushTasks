package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        Pattern p = Pattern.compile("\\b[а-яА-Яa-zA-Z]+\\b");

        while (fileReader.ready()){
            String stringFile = fileReader.readLine().trim();
            Matcher matcher = p.matcher(stringFile);
            int counterWords = 0;

            while (matcher.find()){
                if (words.contains(matcher.group())) counterWords ++;
            }
            if (counterWords == 2) System.out.println(stringFile);
        }
        fileReader.close();
    }
}
