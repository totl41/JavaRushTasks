package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());

        int minimum = min(a1, a2, a3, a4, a5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a1, int a2, int a3, int a4, int a5) {

        int[] arNumber = {a1, a2, a3, a4, a5};

        Arrays.sort(arNumber);

        return arNumber[0];
    }
}
