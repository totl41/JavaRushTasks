package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("Паша1", true, 70);
        Human grandMother1 = new Human("Галя1", false, 68);

        Human grandFather2 = new Human("Паша2", true, 72);
        Human grandMother2 = new Human("Галя2", false, 66);

        Human father = new Human("Саша", true, 35, grandFather1, grandMother1);
        Human mother = new Human("Даша", false, 33, grandFather2, grandMother2);

        Human chl1 = new Human("Толя", true, 14, father, mother);
        Human chl2 = new Human("Женя", true, 12, father, mother);
        Human chl3 = new Human("Оля", false, 7, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(chl1.toString());
        System.out.println(chl2.toString());
        System.out.println(chl3.toString());
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}