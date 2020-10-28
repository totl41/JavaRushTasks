package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        reader.close();

        FileOutputStream filetream1 = new FileOutputStream(name1, true);
        FileInputStream fileStream2 = new FileInputStream(name2);
        FileInputStream fileStream3 = new FileInputStream(name3);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream2, 200);
        int i;

        while((i = bufferedInputStream.read())!= -1){

            filetream1.write((char) i);
        }

        bufferedInputStream = new BufferedInputStream(fileStream3, 200);
        while((i = bufferedInputStream.read())!= -1){

            filetream1.write((char) i);
        }

        filetream1.close();
        fileStream2.close();
        fileStream3.close();
    }
}
