package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int width;
    private int height;

    //1
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    //2
    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    //3
    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    //4
    public Rectangle(Rectangle another){
        this.left = another.left;
        this.top = another.top;
        this.width = another.width;
        this.height = another.height;
    }

    //5
    public static void main(String[] args) {

    }
}
