package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sumNumber = 0;
        double quantityNumber = 0;
        double arithmeticAverage = 0;

        while (true){

            int number = Integer.parseInt(reader.readLine());

            if (number == -1) {

                arithmeticAverage = sumNumber / quantityNumber;

                System.out.println(arithmeticAverage);

                break;
            }
            sumNumber = sumNumber + number;

            quantityNumber ++;
        }
    }
}

