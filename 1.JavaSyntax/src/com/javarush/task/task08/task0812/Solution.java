package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int longNumbers = 1;
        int x = 0;
        ArrayList<Integer> arrLong = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {

            if (x == list.get(i)) longNumbers++;
            else {
                x = list.get(i);
                arrLong.add(longNumbers);
                longNumbers = 1;
            }
        }

        if (longNumbers > 1) arrLong.add(longNumbers);

        Collections.sort(arrLong);
        System.out.println(arrLong.get(arrLong.size() - 1));
    }
}