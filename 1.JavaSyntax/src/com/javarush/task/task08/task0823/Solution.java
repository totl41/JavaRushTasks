package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = reader.readLine().toCharArray();

        //напишите тут ваш код
        boolean toUpperCase = true;

        for (int i = 0; i < charArray.length; i++) {
            if (toUpperCase && Character.isLetter(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
                toUpperCase = false;
            }
            else if (Character.isWhitespace(charArray[i])) toUpperCase = true;
        }
        System.out.println(charArray);
    }
}
