package com.javarush.task.task18.task1820;



import java.io.*;
import java.util.StringJoiner;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileInputStream = reader.readLine();
        String fileOutputStream = reader.readLine();

        String[] buff;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(fileInputStream)))){
            buff = bufferedReader.readLine().split(" ");
            bufferedReader.close();
        }

        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String s: buff){
            stringJoiner.add(roundDigit(s));
        }

        try (FileOutputStream fos = new FileOutputStream(fileOutputStream)){
            fos.write(stringJoiner.toString().getBytes());
            fos.close();
        }
    }

    private static String roundDigit(java.lang.String digit) {
        return String.valueOf((int) Math.round(Double.parseDouble(digit)));
    }
}
