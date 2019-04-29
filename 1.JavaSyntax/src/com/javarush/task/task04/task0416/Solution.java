package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double timeReader = Double.valueOf(reader.readLine());
        String color = null;

        double timeTracker = timeReader % 5;

        if (timeTracker <= 0.0 || timeTracker < 3.0){
            color = "зелёный";
        }
        else if (timeTracker >= 3.0 & timeTracker < 4.0){
            color = "жёлтый";
        }
        else if (timeTracker >= 4.0 & timeTracker < 5.0){
            color = "красный";
        }

        System.out.println(color);
    }
}