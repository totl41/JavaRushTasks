package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        for (int k = 0; k < alphabet.size(); k++) {
            int meter = 0;
            Character cherAlphabet = alphabet.get(k);
            for (int i = 0; i < list.size(); i++) {
                String stringList = list.get(i);
                for (int j = 0; j < stringList.length(); j++) {
                    Character charStr = Character.valueOf(stringList.charAt(j));
                    if (cherAlphabet.equals(charStr)) meter ++;
                }
            }
            System.out.println(cherAlphabet + " " + meter);
        }
    }
}
