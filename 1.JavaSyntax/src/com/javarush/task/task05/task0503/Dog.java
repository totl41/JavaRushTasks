package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

import javax.swing.plaf.PanelUI;

public class Dog {
    //напишите тут ваш код
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
