package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Сталлоне_1", dateFormat.parse("JAN 2 2012"));
        map.put("Сталлоне_2", dateFormat.parse("JUN 1 2012"));
        map.put("Сталлоне_3", dateFormat.parse("JUL 1 2012"));
        map.put("Сталлоне_4", dateFormat.parse("AUG 1 2012"));
        map.put("Сталлоне_5", dateFormat.parse("SEP 1 2012"));
        map.put("Сталлоне_6", dateFormat.parse("MAY 4 2012"));
        map.put("Сталлоне_7", dateFormat.parse("OCT 1 2012"));
        map.put("Сталлоне_8", dateFormat.parse("MAY 5 2012"));
        map.put("Сталлоне_9", dateFormat.parse("DEC 7 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            Date date = (Date) pair.getValue();

            if (date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7 ) iterator.remove();
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
