package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    //напишите тут ваш код
    private String name;
    private int age;
    private char sex;

     //name
     public void setName(String name){
         this.name = name;
     }

     public String getName(){
         return name;
     }

     //age
     public void setAge(int age){
         this.age = age;
     }

     public int getAge(){
         return age;
     }

     //sex
    public void setSex(char sex){
         this.sex = sex;
    }

    public char getSex(){
         return sex;
    }

    public static void main(String[] args) {

    }
}
