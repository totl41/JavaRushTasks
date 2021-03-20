package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        Matcher matcher = Pattern.compile("(\\d+)\\s([\\+\\-\\*])\\s(\\d+)").matcher(result);

        int a = 0;
        int b = 0;
        String sign = "";

        while(matcher.find()) {
            a = Integer.parseInt(matcher.group(1));
            sign = matcher.group(2);
            b = Integer.parseInt(matcher.group(3));
        }

        int intResult = 0;

        if (sign.equals("+")) intResult = a + b;
        else if (sign.equals("-")) intResult = a - b;
        else if (sign.equals("*")) intResult = a * b;

        System.setOut(consoleStream);
        System.out.println(result + intResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

