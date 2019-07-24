package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] int5 = {51,52,53,54,55};
        int[] int2 = {21,22};
        int[] int4 = {41,42,43,44};
        int[] int7 = {71,72,73,74,75,76,77};
        int[] int0 = {};

        arrayList.add(int5);
        arrayList.add(int2);
        arrayList.add(int4);
        arrayList.add(int7);
        arrayList.add(int0);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
