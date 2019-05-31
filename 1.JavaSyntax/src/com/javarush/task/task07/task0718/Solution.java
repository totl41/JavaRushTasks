package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        int length = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (length <= arrayList.get(i).length()) length = arrayList.get(i).length();
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

