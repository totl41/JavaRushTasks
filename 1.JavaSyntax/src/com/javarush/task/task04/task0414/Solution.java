package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.valueOf(reader.readLine());
        String numberOfDays = null;

        if (year % 400 == 0){
            numberOfDays = "366";
        }
        else if (year % 100 == 0 ){
            numberOfDays = "365";
        }
        else if (year % 4 == 0 ){
            numberOfDays = "366";
        }
        else{
            numberOfDays = "365";
        }

        System.out.println("количество дней в году: " + numberOfDays);

    }
}