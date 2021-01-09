package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(bufferedReader.readLine());
        bufferedReader.close();

        Scanner scanner = new Scanner(fileReader);
        int counter = 0;

        while (scanner.hasNext()){

            String[] line = scanner.nextLine().replaceAll("[\\p{P}\\s]", " ").split(" ");

            for (int i = 0; i < line.length; i++) {
                if (line[i].trim().equals("world")) counter ++;
            }
        }

        fileReader.close();
        scanner.close();
        System.out.println(counter);
    }
}
