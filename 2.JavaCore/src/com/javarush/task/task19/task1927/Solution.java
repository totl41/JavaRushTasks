package com.javarush.task.task19.task1927;

import sun.security.util.BitArray;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String[] resultList = outputStream.toString().split("\r\n");
        String result = "";

        for (int i = 0; i < resultList.length; i++) {
             result = result + resultList[i] + System.lineSeparator();
             int ii = i + 1;
            if (ii % 2 == 0) result = result + "JavaRush - курсы Java онлайн" + System.lineSeparator();
        }
        System.setOut(consoleStream);
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
