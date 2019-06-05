package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> arrList = new ArrayList<String>();
        String currentWord = "";

        while (true){
            currentWord = reader.readLine();

            if (! currentWord.equals("end")) arrList.add(currentWord);
            else break;
        }
        for (int i = 0; i < arrList.size(); i++) System.out.println(arrList.get(i));
    }
}