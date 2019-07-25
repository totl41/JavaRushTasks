package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> arrString = new ArrayList<String>();
        ArrayList<Integer> arrInt = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) arrInt.add(Integer.parseInt(array[i]));
            else arrString.add(array[i]);
        }

        //sort the words
        for (int i = arrString.size() -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(arrString.get(j), arrString.get(j + 1))){
                    String temp = arrString.get(j + 1);
                    arrString.set(j + 1, arrString.get(j));
                    arrString.set(j, temp);
                }
            }
        }

        //sort the numbers
        for (int i = arrInt.size() -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrInt.get(j+1) > arrInt.get(j)){
                    Integer temp = arrInt.get(j+1);
                    arrInt.set(j+1, arrInt.get(j));
                    arrInt.set(j, temp);
                }
            }
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(arrInt.get(x));
                x ++;
            }
            else {
                array[i] = arrString.get(y);
                y ++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
