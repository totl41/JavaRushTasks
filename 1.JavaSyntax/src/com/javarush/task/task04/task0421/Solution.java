package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();

        String message = "";

        if (a.equals(b)){
            message = "Имена идентичны";
        }
        else if (a.length() == b.length()){
            message = "Длины имен равны";
        }

        if (message != ""){
            System.out.print(message);
        }
    }
}
