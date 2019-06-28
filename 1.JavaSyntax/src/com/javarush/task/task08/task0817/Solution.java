package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        map.put("Фамилия_1", "Имя_1");
        map.put("Фамилия_2", "Имя_2");
        map.put("Фамилия_3", "Имя_3");
        map.put("Фамилия_4", "Имя_1");
        map.put("Фамилия_5", "Имя_4");
        map.put("Фамилия_6", "Имя_5");
        map.put("Фамилия_7", "Имя_6");
        map.put("Фамилия_8", "Имя_1");
        map.put("Фамилия_9", "Имя_1");
        map.put("Фамилия_10", "Имя_10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        removeItemFromMapByValue(map, "Имя_1");
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
