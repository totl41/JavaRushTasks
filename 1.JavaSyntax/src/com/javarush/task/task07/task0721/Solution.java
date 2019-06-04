package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] arrInt = new int[20];

        for (int i = 0; i < 20; i++) arrInt[i] = Integer.parseInt(reader.readLine());

        Arrays.sort(arrInt);

        minimum = arrInt[0];
        maximum = arrInt[19];

        System.out.print(maximum + " " + minimum);
    }
}
