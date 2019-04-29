package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        int c = Integer.valueOf(reader.readLine());

        String stringNumber = null;

        if (a == b & a == c & b == c){
            stringNumber = String.valueOf(a) + " " + String.valueOf(b) + " " + String.valueOf(c);
        }

        else if (a == b ){
            stringNumber = String.valueOf(a) + " " + String.valueOf(b);
        }

        else if (a == c){
            stringNumber = String.valueOf(a) + " " + String.valueOf(c);
        }

        else if (b == c){
            stringNumber = String.valueOf(b) + " " + String.valueOf(c);
        }

        if (stringNumber != null){
            System.out.println(stringNumber);
        }
    }
}