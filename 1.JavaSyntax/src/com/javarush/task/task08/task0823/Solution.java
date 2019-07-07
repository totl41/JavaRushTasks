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
        String string = reader.readLine();

        //напишите тут ваш код
        String[] isPast = string.split(" ");
        String past = " ";

        for (int i = 0; i < string.length(); i++) {
            if (! newString.equals(" ")) newString = newString + " ";
            newString = newString + isPast[i].substring(0, 1).toUpperCase() + isPast[i].substring(1);
        }
        System.out.println(newString);
    }
}
