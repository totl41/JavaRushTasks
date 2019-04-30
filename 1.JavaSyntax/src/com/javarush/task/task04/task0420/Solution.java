package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.valueOf(reader.readLine());
        int a2 = Integer.valueOf(reader.readLine());
        int a3 = Integer.valueOf(reader.readLine());

        Integer[] array = {a1, a2, a3};

        Arrays.sort(array, Collections.reverseOrder());

        String stringNumber = "";

        for (int i = 0; i < array.length; i++){

            if (stringNumber != ""){
                stringNumber = stringNumber + " ";
            }

            stringNumber = stringNumber + String.valueOf(array[i]);
        }

        System.out.print(stringNumber);
    }
}
