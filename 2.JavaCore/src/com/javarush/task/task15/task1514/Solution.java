package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        Double keyLabels;
        String valueLabels = "";
        for (int i = 1; i < 6; i++) {
            keyLabels = (double) i;
            valueLabels = "value_" + Integer.toString(i);
            labels.put(keyLabels, valueLabels);
        }
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
