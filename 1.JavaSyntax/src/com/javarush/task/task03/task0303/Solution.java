package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double us1 = convertEurToUsd(15, 0.95);
        System.out.println(us1);

        double us2 = convertEurToUsd(150, 0.87);
        System.out.println(us2);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;
    }
}
