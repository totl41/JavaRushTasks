package com.javarush.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

//        Garden fruitGarden = new Garden();
//        Garden vegetGarden = new Garden();
//
//        for (int i = 0; i < 10; i++) {
//            fruitGarden.addFruit(i, "фрукт_" + i);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            vegetGarden.addVegetable(i, "растение_" + i);
//        }
//
//        for (int i = fruitGarden.fruits.size() - 1; i >= 0; i--) {
//            fruitGarden.removeFruit(i);
//        }
//
//        for (int i = vegetGarden.vegetables.size() - 1; i >= 0; i--) {
//            vegetGarden.removeVegetable(i);
//        }

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit){
            fruits.add(index, fruit);
//            System.out.println("Уже добавлен фрукт [" + fruit + "]");
        }

        public synchronized void removeFruit(int index){
//            String fruit = fruits.get(index);
            fruits.remove(index);
//            System.out.println("Уже удален фрукт [" + fruit + "]");
        }

        public synchronized void addVegetable(int index, String vegetable){
            vegetables.add(index, vegetable);
//            System.out.println("Уже добавлено растение [" + vegetable + "]");
        }

        public synchronized void removeVegetable(int index){
//            String vegetable = vegetables.get(index);
            vegetables.remove(index);
//            System.out.println("Уже удалено растение [" + vegetable + "]");
        }

    }
}
