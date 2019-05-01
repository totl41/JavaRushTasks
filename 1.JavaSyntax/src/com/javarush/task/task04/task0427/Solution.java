package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.valueOf(reader.readLine());
        String notion = null;

        if ((x % 2 == 0) && x > 0 && x < 10){
            notion = "четное однозначное число";
        }
        else if ((x % 2 == 0) && x >= 10 && x < 100){
            notion = "четное двузначное число";
        }
        else if ((x % 2 == 0) && x >= 100 && x < 1000){
            notion = "четное трехзначное число";
        }
        if ((x % 2 != 0) && x > 0 && x < 10){
            notion = "нечетное однозначное число";
        }
        else if ((x % 2 != 0) && x >= 10 && x < 100){
            notion = "нечетное двузначное число";
        }
        else if ((x % 2 != 0) && x >= 100 && x < 1000){
            notion = "нечетное трехзначное число";
        }

        if (notion != null) {
            System.out.print(notion);
        }
    }
}
