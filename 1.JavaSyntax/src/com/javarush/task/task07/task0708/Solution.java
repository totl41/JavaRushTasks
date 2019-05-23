package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Solution.strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            Solution.strings.add(reader.readLine());
        }

        ArrayList<Integer> arrMax = new ArrayList<Integer>();
        int maxSise = 0;

        for (int i = 0; i < 5; i++) {

            if (maxSise < Solution.strings.get(i).length()){
                arrMax.clear();
                maxSise = Solution.strings.get(i).length();
                arrMax.add(i);
            }
            else if (maxSise == Solution.strings.get(i).length()){
                arrMax.add(i);
            }
        }

        for (int i = 0; i < arrMax.size(); i++) {
            System.out.println(Solution.strings.get(arrMax.get(i)));
        }
    }
}
