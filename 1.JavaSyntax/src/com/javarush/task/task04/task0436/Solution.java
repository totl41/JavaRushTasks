package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int x = 1; x <= m; x++){
            for (int y = 1; y <= n; y++){
                if (y != n)
                    System.out.print("8");
                else
                    System.out.println("8");
            }
        }
    }
}
