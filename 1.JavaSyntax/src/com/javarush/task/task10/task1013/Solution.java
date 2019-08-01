package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String x1;
        private int x2;
        private boolean x3;
        private char x4;
        private double x5;
        private long x6;

        public Human(String x1){
            this.x1 = x1;
        }

        public Human(int x2){
            this.x2 = x2;
        }

        public Human(boolean x3){
            this.x3 = x3;
        }

        public Human(char x5){
            this.x5 = x5;
        }

        public Human(long x6){
            this.x6 = x6;
        }

        public Human(String x1, int x2){
            this.x1 = x1;
            this.x2 = x2;
        }

        public Human(String x1, boolean x3){
            this.x1 = x1;
            this.x3 = x3;
        }

        public Human(String x1, char x4){
            this.x1 = x1;
            this.x4 = x4;
        }

        public Human(String x1, double x5){
            this.x1 = x1;
            this.x5 = x5;
        }

        public Human(String x1, long x6){
            this.x1 = x1;
            this.x6 = x6;
        }
    }
}
