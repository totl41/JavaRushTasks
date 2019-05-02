package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String s = "8";

        for (int x = 1; x <= 10; x++){

            System.out.println(s);

            s = s + "8";
        }
    }
}
