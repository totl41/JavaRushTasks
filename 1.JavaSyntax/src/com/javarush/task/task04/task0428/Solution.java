package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.valueOf(reader.readLine());
        int a2 = Integer.valueOf(reader.readLine());
        int a3 = Integer.valueOf(reader.readLine());
        int x = 0;

        if (a1 >0){
            x ++;
        }
        if (a2 > 0){
            x ++;
        }
        if (a3 > 0){
            x ++;
        }

        System.out.println(x);

    }
}
