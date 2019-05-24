package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        String strArray = "";

        for (int i = 0; i < 13; i++) {
            strArray = arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, strArray);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
