package com.javarush.task.task03.task0305;

/* 
Я так давно родился
*/

import sun.util.calendar.LocalGregorianCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Calendar calendar = new GregorianCalendar();

        calendar.add(Calendar.DAY_OF_MONTH, -1);

        DateFormat df = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);

        String dataStr = new String(df.format(calendar.getTime()));

        System.out.print(dataStr.toUpperCase());
    }
}
