package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.US);

        Date date1 = format.parse(date);
        Date date2 = new Date(date1.getYear(), 0, 0);

        long difference = date1.getTime() - date2.getTime();
        long s = (24*60*60*1000);
        int dayCounter = (int) (difference/s);

        if ((dayCounter % 2) == 1){
            return true;
        }
        return false;
    }
}
