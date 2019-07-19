package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] charArray = reader.readLine().toCharArray();
        ArrayList<Character> arrayVowel = new ArrayList<Character>();
        ArrayList<Character> arrayConsonant = new ArrayList<Character>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') continue;
            else if (isVowel(charArray[i]) ) arrayVowel.add(charArray[i]);
            else arrayConsonant.add(charArray[i]);
        }
        for (char x : arrayVowel) System.out.print(x + " ");
        System.out.println("");
        for (char x : arrayConsonant) System.out.print(x + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}