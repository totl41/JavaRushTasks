package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean rederTrue = true;

        while (rederTrue){
            String x = reader.readLine();

            if (!x.equals("exit")){

                //1.проверяем, что в строке нет других символов, кроме цифр и точки
                try {
                    short y = Short.parseShort(x);
                    if (0 < y < 128) print(x);
                }
                catch (NumberFormatException e){
                    try {
                        Integer y = Integer.parseInt(x);
                        if (y <= 0 && y >= 128) print(x);
                    }
                    catch (NumberFormatException e1){
                        e1.printStackTrace();
                    }
                }


                //2.при наличии точки пытаемся преобразовать к double
                //3.пытаемся преобразовать к sort
                //4.пытаемся преобразовать к integer
                //5.если не 2-4 или это 1 - это строка

                if (x.matches(".")) print(x);
                if (x.equals(".")) print(x);



            }
            else rederTrue = false;
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
