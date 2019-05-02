package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 1;
        int y = 1;

        while (x <= 10){
            while (y <= 9){
                System.out.print((x*y) + " ");
                y ++;
            }

            System.out.println(x*y);

            y = 1;
            x++;
        }
    }
}
