package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        String season = null;

        if (month >= 12 | month <= 2){
            season = "зима";
        }
        else if (month >= 3 & month <= 5){
            season = "весна";
        }
        else if (month >= 6 & month <= 8){
            season = "лето";
        }
        else if (month >= 9 & month <= 11){
            season = "осень";
        }

        System.out.println(season);
    }
}