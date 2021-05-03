package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream consoleStream = System.out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputFile = new FileOutputStream(reader.readLine());

        reader.close();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);
        testString.printSomething();

        System.setOut(consoleStream);

        System.out.println(outputStream);

        outputFile.write(outputStream.toByteArray());

        outputFile.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

