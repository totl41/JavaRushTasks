package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        final Random random = new Random();

        for (int i = 0; i < 10; i++) map.put("LastName_" + i, random.nextInt(1000));

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Map<String, Integer> copyMap = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copyMap.entrySet()){
            if (pair.getValue() < 500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}