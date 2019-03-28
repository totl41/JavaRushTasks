package com.javarush.task.task02.task0209;

/* 
Макс, Белла и Джек
*/
public class Solution {
    public static void main(String[] args) {
        Dog dogMax = new Dog();
        dogMax.name = "Max";

        //напишите тут ваш код
        Dog dogBella = new Dog();
        dogBella.name = "Bella";

        Dog dogJack = new Dog();
        dogJack.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
