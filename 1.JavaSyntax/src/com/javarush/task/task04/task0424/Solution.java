package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.valueOf(reader.readLine());
        int a2 = Integer.valueOf(reader.readLine());
        int a3 = Integer.valueOf(reader.readLine());


        if (a1 == a2 & a3 != a1){
            System.out.println(3);
        }
        else if (a1 == a3 & a2 != a1){
            System.out.println(2);
        }
        else if(a2 == a3 & a1 != a2){
            System.out.println(1);
        }
    }
}
