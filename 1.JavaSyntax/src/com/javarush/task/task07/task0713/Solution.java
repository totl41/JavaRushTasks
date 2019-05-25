package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        int x = 0;

        for (int i = 0; i < arrayList.size(); i++) {

            x = arrayList.get(i);

            if (x % 3 == 0 || x % 2 == 0) {
                if (x % 3 == 0) arrayList1.add(x);
                if (x % 2 == 0) arrayList2.add(x);
            }
            else arrayList3.add(x);
        }
        printList(arrayList);
        printList(arrayList1);
        printList(arrayList2);
        printList(arrayList3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
