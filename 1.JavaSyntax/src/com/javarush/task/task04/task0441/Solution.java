package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());

        int[] arNumber = new int[]{a1, a2, a3};
        Arrays.sort(arNumber);
        System.out.println(arNumber[1]);
    }
}
