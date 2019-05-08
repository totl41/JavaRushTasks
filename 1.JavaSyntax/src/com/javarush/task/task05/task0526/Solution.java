package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Alex", 22, "Moscow");
        Man man2 = new Man("Paul", 35, "Saratov");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman wonem1 = new Woman("Olga", 23, "Moscow");
        Woman wonem2 = new Woman("Gerda", 25, "Moscow");

        System.out.println(wonem1.name + " " + wonem1.age + " " + wonem1.address);
        System.out.println(wonem2.name + " " + wonem2.age + " " + wonem2.address);

    }

    //напишите тут ваш код
    public static class Man{

        private String name;
        private int age;
        private  String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{

        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
