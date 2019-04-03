package com.javarush.task.task02.task0217;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/*
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        return Collections.min(Arrays.asList(min(a, b), c, d));
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        return Collections.min(Arrays.asList(a, b));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}