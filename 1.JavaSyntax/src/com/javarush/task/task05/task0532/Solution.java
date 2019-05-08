package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dimension = Integer.parseInt(reader.readLine());
        int maximum = 0;
        int[] arNumber = new int[dimension];

        //напишите тут ваш код
        for (int i = 0; i < dimension; i++) {
            arNumber[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(arNumber);
        maximum = arNumber[dimension - 1];

        System.out.println(maximum);
    }
}
