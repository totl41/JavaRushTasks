package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr20 = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            arr20[i] = Integer.parseInt(reader.readLine());
        }

        System.arraycopy(arr20, 0, arr1, 0, 10);
        System.arraycopy(arr20, 10, arr2, 0, 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }



    }
}
