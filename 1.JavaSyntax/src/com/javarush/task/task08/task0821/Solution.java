package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> peoples = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {

            if (i == 2 || i == 3) peoples.put("LastName_" + 1, "Name_" + i);
            else if (i == 4 || i == 5) peoples.put("LastName_" + i, "Name_" + 2);
            else peoples.put("LastName_" + i, "Name_" + i);
        }
        return peoples;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
