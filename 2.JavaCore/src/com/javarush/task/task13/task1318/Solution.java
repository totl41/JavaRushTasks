package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        InputStream inputStream =null;
        BufferedInputStream buffer = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();



        try{
            inputStream = new FileInputStream(fileName);
            buffer = new BufferedInputStream(inputStream);

            while (buffer.available()>0){
                char s = (char) buffer.read();
                System.out.print(s);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            reader.close();
            inputStream.close();
            buffer.close();
        }
    }
}