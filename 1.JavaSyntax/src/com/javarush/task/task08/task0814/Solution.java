package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> setNumber = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) setNumber.add(i);
        return setNumber;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> setIterator = set.iterator();

        while (setIterator.hasNext()){
            int number = setIterator.next();
            if (number > 10) setIterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

        removeAllNumbersGreaterThan10(createSet());
    }
}
