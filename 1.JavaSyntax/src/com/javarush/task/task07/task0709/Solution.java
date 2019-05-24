package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        int minSize = 0;
        ArrayList<Integer> arrMin = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {

            if (i == 0) {
                arrMin.add(i);
                minSize = arrayList.get(i).length();
            }
            else if (minSize > arrayList.get(i).length()){
                if (arrMin.size() != 0 ) arrMin.clear();
                arrMin.add(i);
                minSize = arrayList.get(i).length();
            }
            else if (minSize == arrayList.get(i).length()) arrMin.add(i);
        }

        for (int i = 0; i < arrMin.size(); i++) {
            System.out.println(arrayList.get(arrMin.get(i)));
        }
    }
}
