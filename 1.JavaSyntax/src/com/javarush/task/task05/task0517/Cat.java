package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    //1
    public Cat(String name){
        this.name = name;
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.address = null;
        this.color = "Серый";
    }

    //2
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "Серый";
    }

    //3
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.address = null;
        this.color = "Серый";
    }

    //4
    public Cat(int weight, String color){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    //5
    public Cat(int weight, String color, String address){
        this.name = null;
        this.age = 3;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
