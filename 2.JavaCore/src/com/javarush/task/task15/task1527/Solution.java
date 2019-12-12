package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String xString = reader.readLine().trim();
        int i = xString.indexOf("?");
        String[] options = xString.substring(i+1).split("&");
        String volObj = null;

        for (int j = 0; j < options.length; j++) {

            String[] vol = options[j].split("=");

            if (!(j == 0)) System.out.print(" ");

            System.out.print(vol[0]);

            if (!(vol.length == 1) && vol[0].equals("obj")) volObj = vol[1];
        }

        if (!(volObj == null)){
            System.out.println("");
            try {
                alert(Double.parseDouble(volObj));
            }
            catch (NumberFormatException e){
                alert(volObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
