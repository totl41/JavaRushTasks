package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException, NumberFormatException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String xString = reader.readLine();

            if (xString.equals("exit")) break;

            try {
                //2.при наличии точки пытаемся преобразовать к double
                if (xString.contains(".")) print(Double.parseDouble(xString));

                //3.пытаемся преобразовать к sort
                else if (Integer.parseInt(xString) <= 0 || Integer.parseInt(xString) >= 128) print(Integer.parseInt(xString));

                //4.пытаемся преобразовать к integer
                else if (0 < Short.parseShort(xString) && Short.parseShort(xString) < 128) print(Short.parseShort(xString));
                }
                catch (NumberFormatException e){
                    print(xString);
                }
            }
        reader.close();
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
