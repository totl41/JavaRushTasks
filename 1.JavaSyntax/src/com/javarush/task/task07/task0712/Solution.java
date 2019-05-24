package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }

        int maxSize = 0;
        int minSize = arrayList.get(0).length();

        int maxInd = 0;
        int minInd = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            if (maxSize < arrayList.get(i).length()){
                maxSize = arrayList.get(i).length();
                maxInd = i;
            }

            if (minSize > arrayList.get(i).length() ){
                minSize = arrayList.get(i).length();
                minInd = i;
            }
        }
        if (maxInd < minInd) System.out.println(arrayList.get(maxInd));
        if (maxInd > minInd) System.out.println(arrayList.get(minInd));
    }
}
