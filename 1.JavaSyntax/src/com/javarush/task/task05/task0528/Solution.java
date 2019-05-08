package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar calendar = Calendar.getInstance();
        DateFormat sdf = new SimpleDateFormat("dd MM yyyy");

        System.out.println(sdf.format(calendar.getTime()));
    }
}
