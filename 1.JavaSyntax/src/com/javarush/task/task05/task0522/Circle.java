package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    //1
    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //2
    public Circle(double x){
        this(x, 5, 5);
    }

    //3
    public Circle(double x, double y){
        this(x, y, 5);
    }

    //4
    public Circle(Circle another){
        this(another.x, another.y, another.radius);
    }

    // п/у
    public Circle(){
        this(5, 5, 5);
    }

    public static void main(String[] args) {

    }
}