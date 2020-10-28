package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = "";

        boolean fileExist = true;

        while (fileExist){

            try {
                nameFile = reader.readLine();
                FileInputStream fileInputStream = new FileInputStream(nameFile);
                fileInputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(nameFile);
                e.printStackTrace();
                fileExist = false;
            }
        }
        reader.close();
    }
}
