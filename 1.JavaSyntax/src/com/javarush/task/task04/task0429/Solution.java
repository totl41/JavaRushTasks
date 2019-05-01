package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int positiveNumber = 0;
        int negativeNumber = 0;

        String negativeLegend = "количество отрицательных чисел: ";
        String positiveLegend = "количество положительных чисел: ";

        if (a1 > 0){
            positiveNumber ++;
        }
        else if (a1 < 0){
            negativeNumber ++;
        }

        if (a2 > 0){
            positiveNumber ++;
        }
        else if (a2 < 0){
            negativeNumber ++;
        }

        if (a3 > 0){
            positiveNumber ++;
        }
        else if (a3 < 0){
            negativeNumber ++;
        }

        System.out.println(negativeLegend + negativeNumber);
        System.out.println(positiveLegend + positiveNumber);

    }
}
