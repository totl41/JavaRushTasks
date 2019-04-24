package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int xA = 10 - a;
        int xB = 10 - b;

        xA = abs(xA);
        xB = abs(xB);

        if (xA < xB) {
            System.out.println(a);
        }
        else if (xB < xA){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}