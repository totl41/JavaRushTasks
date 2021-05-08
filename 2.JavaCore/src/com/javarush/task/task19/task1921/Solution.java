package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        while (reader.ready()){

            String readLine = reader.readLine();

            String nameString = readLine.replaceAll("\\d","").trim();
            String dateString = readLine.replace(nameString, "").trim();

            Date date = simpleDateFormat.parse(dateString);
            PEOPLE.add(new Person(nameString, date));
        }
        reader.close();
    }
}
