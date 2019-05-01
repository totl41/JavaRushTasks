package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.valueOf(reader.readLine());
        String notion = null;

        if (x == 0){
            notion = "ноль";
        }
        else if (x < 0 && (x % 2 == 0)){
            notion = "отрицательное четное число";
        }
        else if (x < 0 && (x % 2 != 0)){
            notion = "отрицательное нечетное число";
        }
        else if (x > 0 && (x % 2 == 0)){
            notion = "положительное четное число";
        }
        else if (x > 0 && (x % 2 != 0)){
            notion = "положительное нечетное число";
        }

        System.out.println(notion);

    }
}
