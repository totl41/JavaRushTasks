package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size();) {

            String listString = list.get(i);
            int indP = list.get(i).indexOf("р");
            int indL = list.get(i).indexOf("л");

            if (indP != -1 && indL == -1) list.remove(i);
            else if (indP == -1 && indL != -1) {

                list.add(i++, listString);
                i++;
                }
            else i++;
            }

        return list;
    }
}
