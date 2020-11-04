package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) return;
        int idProd = Integer.parseInt(args[1]);

        String idStr = "";
        String productName = "";
        String price = "";
        String quantity = "";

        if (args[0].equals("-u")){
            idStr = String.format("%-8s", idProd);
            productName = String.format("%-30s", args[2]);
            price = String.format("%-8s", Float.parseFloat(args[3]));
            quantity = String.format("%-4s", Integer.parseInt(args[4]));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));

        ArrayList<String> listProduct = new ArrayList<String>();
        String lineFromFile;

        while ((lineFromFile = bufferedReader.readLine()) != null){
            int idLine = Integer.parseInt(lineFromFile.substring(0, 8).trim());
            if (idLine == idProd){
                if (args[0].equals("-u")){
                    listProduct.add(idStr + productName + price + quantity);
                }
                else if (args[0].equals("-d")) continue;
            }
            else listProduct.add(lineFromFile);
        }

        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameFile)));

        boolean firstLine = true;
        for (String line: listProduct) {
            if (!firstLine) bufferedWriter.write("\n" + line);
            else {
                bufferedWriter.write(line);
                firstLine = false;
            }
        }
        bufferedWriter.close();
    }
}
