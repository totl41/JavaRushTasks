package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.valueOf(reader.readLine());
        int a2 = Integer.valueOf(reader.readLine());
        int a3 = Integer.valueOf(reader.readLine());
        int a4 = Integer.valueOf(reader.readLine());

        int[] arrayNumber = {a1, a2, a3, a4};

        OptionalInt max = Arrays.stream(arrayNumber).max();

        System.out.println(max.getAsInt());

    }
}
