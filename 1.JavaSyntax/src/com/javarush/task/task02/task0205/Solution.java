package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате
*/
public class Solution {
    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        // напишите тут ваш код
        int salary = a + 100;
        String s1 = "Твоя зарплата составляет: ";
        String s2 = " долларов в месяц.";
        
        System.out.print(s1 + salary + s2);
    }
}
