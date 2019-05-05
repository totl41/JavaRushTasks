package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private  int weight;
    private String address;
    private String color;

    //1
    public void initialize(String name){
        this.name = name;
        this.age = 4;
        this.weight = 4;
        this.color = "Серый";
        this.address = null;
    }

    //2
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Серый";
        this.address = null;
    }

    //3
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "Серый";
        this.address = null;
    }

    //4
    public void initialize(int weight, String color){
        this.name = null;
        this.age = 4;
        this.weight = weight;
        this.color = color;
        this.address = null;

    }

    //5
    public void initialize(int weight, String color, String address){
        this.name = null;
        this.age = 4;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
