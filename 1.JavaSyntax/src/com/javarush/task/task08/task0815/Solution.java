package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> mapPeopl = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            mapPeopl.put("Фамилия_" + i, "Имя_" + i);
        }
        return mapPeopl;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int x = 0;

        Set<String> xK = map.keySet();

        for (String text : xK) {

            String stringValue = map.get(text);

            if (stringValue.equals(name)) x ++ ;
        }
        return x;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int x = 0;

        Set<String> xK = map.keySet();

        for (String text : xK) {
            if (text.equals(lastName)) x ++ ;
        }
        return x;
    }

    public static void main(String[] args) {
    }
}
