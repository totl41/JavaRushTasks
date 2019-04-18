package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nYears = reader.readLine();
        String name = reader.readLine();

        //int nAge = Integer.parseInt(nYears);
        System.out.print(name + " захватит мир через " + nYears + " лет. Му-ха-ха!");

    }
}
