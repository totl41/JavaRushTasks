package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat cat = new Cat("Tomm", 5, 10);
        Dog dog = new Dog("Tuzick", 3, 8);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Cat{
        private String name;
        private int age;
        private int tail;

        public Cat(String name, int age, int tail) {
            this.name = name;
            this.age = age;
            this.tail = tail;
        }
    }

    public static class Dog{
        private String name;
        private int age;
        private int tail;

        public Dog(String name, int age, int tail) {
            this.name = name;
            this.age = age;
            this.tail = tail;
        }
    }
}
