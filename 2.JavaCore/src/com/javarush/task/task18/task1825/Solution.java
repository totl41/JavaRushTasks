package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFail = "";
        HashMap<Integer, String> mapFile = new HashMap<>();
        int numberPart = 0;
        String nameFileOutput = "";

        while (!(nameFail = reader.readLine()).equals("end")){
            numberPart = Integer.parseInt(nameFail.substring(nameFail.indexOf("part") + 4));
            mapFile.put(numberPart, nameFail);
            nameFileOutput = nameFail.substring(0, nameFail.indexOf(".part"));
        }

        reader.close();

        FileOutputStream fileOutputStream = new FileOutputStream(nameFileOutput, true);
        for (Map.Entry<Integer, String> entry : mapFile.entrySet()){
            FileInputStream fileInputStream = new FileInputStream(entry.getValue());
            while (fileInputStream.available() > 0){
                byte[] buff = new byte[fileInputStream.available()];
                fileInputStream.read(buff);
                fileOutputStream.write(buff);
            }
            fileInputStream.close();
        }
        fileOutputStream.close();
    }
}
