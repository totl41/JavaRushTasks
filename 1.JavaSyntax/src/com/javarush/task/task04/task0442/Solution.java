package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;

        while (true){

            int number = Integer.parseInt(reader.readLine());

            x = x + number;

            if (number == -1){
                System.out.println(x);
                break;
            }
        }
    }
}
