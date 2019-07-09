package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();

        Calendar calendar = new GregorianCalendar();

        Map<String, Integer> mapMonth = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);

        System.out.println(month + " is the " + (mapMonth.get(month) + 1) + " month");
    }
}
