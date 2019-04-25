package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dayOfWeekNumber = Integer.valueOf(reader.readLine());
        String dayOfWeek = null;

        if (dayOfWeekNumber < 1 | dayOfWeekNumber > 7){
            dayOfWeek = "такого дня недели не существует";
        }
        else if (dayOfWeekNumber == 1){
            dayOfWeek = "понедельник";
        }
        else if (dayOfWeekNumber == 1){
            dayOfWeek = "понедельник";
        }
        else if (dayOfWeekNumber == 2){
            dayOfWeek = "вторник";
        }
        else if (dayOfWeekNumber == 3){
            dayOfWeek = "среда";
        }
        else if (dayOfWeekNumber == 4){
            dayOfWeek = "четверг";
        }
        else if (dayOfWeekNumber == 5){
            dayOfWeek = "пятница";
        }
        else if (dayOfWeekNumber == 6){
            dayOfWeek = "суббота";
        }
        else if (dayOfWeekNumber == 7){
            dayOfWeek = "воскресенье";
        }

        System.out.println(dayOfWeek);
    }
}