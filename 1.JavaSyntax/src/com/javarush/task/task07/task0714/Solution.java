package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        arrayList.remove(2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(arrayList.size() - i - 1));
        }
    }
}


