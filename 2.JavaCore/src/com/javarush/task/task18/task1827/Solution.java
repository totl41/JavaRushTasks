package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameFile = reader.readLine();
        reader.close();

        if (args.length == 0) return;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));

        int newID = 0;
        String lineFromFile;

        while ((lineFromFile = bufferedReader.readLine()) != null){
            int idInt = Integer.parseInt(lineFromFile.substring(0, 8).trim());
            if (newID < idInt) newID = idInt;
        }
        newID ++;

        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile, true)));

        String idStr = String.format("%-8s", newID);
        String productName = String.format("%-30s", args[1]);
        String price = String.format("%-8s", Float.parseFloat(args[2]));
        String quantity = String.format("%-4s", Integer.parseInt(args[3]));

        if (newID == 1) bufferedWriter.write(idStr + productName + price + quantity);
        else bufferedWriter.write("\n" + idStr + productName + price + quantity);

        bufferedWriter.close();
    }
}
