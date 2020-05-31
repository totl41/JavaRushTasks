package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        while (inputStream.available() > 0) arrayList1.add(inputStream.read());
        inputStream.close();

        ArrayList countRare = new ArrayList();
        int count = 0;

        for (int i = 0; i < arrayList1.size(); i++) {
            count = Collections.frequency(arrayList1, arrayList1.get(i));
            if (!countRare.contains(count)) countRare.add(count);
        }
        Collections.sort(countRare);

        for (int i = 0; i < arrayList1.size(); i++) {
            count = Collections.frequency(arrayList1, arrayList1.get(i));
            if ((int)countRare.get(0) == count) arrayList2.add(arrayList1.get(i));
        }

        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i));
            if ((i + 1) < arrayList2.size()) System.out.print(" ");
        }
    }
}
