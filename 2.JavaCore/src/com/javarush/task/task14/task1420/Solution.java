package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        if (x <= 0 || y <= 0) throw new Exception();

        int z = GCD_1(x, y);
        System.out.println(z);
    }

    public static int GCD_1(int x, int y) {
        if (y == 0) return x;
        return GCD_1(y, x % y);
    }
}
