package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            arrList.add("dddddd_" + i);
        }

        System.out.println(arrList.size());

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
    }
}
