package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1 = new Human();
        grandFather1.name = "grandFather1";
        grandFather1.sex = true;
        grandFather1.age = 72;

        Human grandFather2 = new Human();
        grandFather2.name = "grandFather2";
        grandFather2.sex = true;
        grandFather2.age = 80;

        Human grandMother1 = new Human();
        grandMother1.name = "grandMother1";
        grandMother1.sex = false;
        grandMother1.age = 70;

        Human grandMother2 = new Human();
        grandMother2.name = "grandMother2";
        grandMother2.sex = false;
        grandMother2.age = 76;

        Human father = new Human();
        father.name = "Father";
        father.sex = true;
        father.age = 37;

        Human mother = new Human();
        mother.name = "Mother";
        mother.sex = false;
        mother.age = 35;

        Human child1 = new Human();
        child1.name = "Child1";
        child1.sex = true;
        child1.age = 7;

        Human child2 = new Human();
        child2.name = "Child2";
        child2.sex = false;
        child2.age = 4;

        Human child3 = new Human();
        child3.name = "Child3";
        child3.sex = true;
        child3.age = 1;

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        grandFather1.children.add(father);
        grandMother1.children.add(father);

        grandFather2.children.add(mother);
        grandMother2.children.add(mother);

        grandFather1.toString();
        grandFather2.toString();
        grandMother1.toString();
        grandMother2.toString();
        father.toString();
        mother.toString();
        child1.toString();
        child2.toString();
        child3.toString();
    }

    public static class Human {
        //напишите тут ваш код

        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            System.out.println(text);
            return text;
        }
    }
}
