package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private Solution(String s){}
    protected Solution(Integer s){}
    Solution(Short s){}
    public Solution(Long s){}
}

