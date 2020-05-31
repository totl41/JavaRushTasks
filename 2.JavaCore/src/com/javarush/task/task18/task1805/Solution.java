package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        ArrayList arrayList = new ArrayList();

        while (inputStream.available() > 0){
            int currentData = inputStream.read();
            if (!arrayList.contains(currentData)) arrayList.add(currentData);
        }
        inputStream.close();
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if (i < arrayList.size()) System.out.print(" ");
        }
    }
}
