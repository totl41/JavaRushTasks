package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import jdk.nashorn.internal.ir.IfNode;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = Integer.valueOf(reader.readLine());

        if (y > 0){
            x = y * 2;

        }
        else if (y < 0){
            x = y + 1;
        }

        System.out.println(x);

    }

}