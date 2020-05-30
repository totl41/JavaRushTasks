package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        if(args.length == 0) return;

        Person thePerson = null;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        if (args[i + 1].equals("м")) thePerson = Person.createMale(args[i], getDate(args[i + 2]));
                        else if (args[i + 1].equals("ж"))
                            thePerson = Person.createFemale(args[i], getDate(args[i + 2]));
                        allPeople.add(thePerson);
                        System.out.println(allPeople.indexOf(thePerson));
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        thePerson = allPeople.get(Integer.parseInt(args[i]));
                        thePerson.setName(args[i + 1]);
                        thePerson.setBirthDate(getDate(args[i + 3]));
                        if (args[i + 2].equals("м")) thePerson.setSex(Sex.MALE);
                        else if (args[i + 2].equals("ж")) thePerson.setSex(Sex.FEMALE);
                        allPeople.set(Integer.parseInt(args[i]), thePerson);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        thePerson = allPeople.get(Integer.parseInt(args[i]));
                        thePerson.setName(null);
                        thePerson.setBirthDate(null);
                        thePerson.setSex(null);
                        allPeople.set(Integer.parseInt(args[i]), thePerson);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        thePerson = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(thePerson.getName() + " " + (thePerson.getSex() == Sex.MALE ? "м" : "ж") + " "
                                + dateFormat.format(thePerson.getBirthDate()));
                    }
                    break;
                }
        }
    }

    public static Date getDate(String string){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date = null;
        try {
            date = dateFormat.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
