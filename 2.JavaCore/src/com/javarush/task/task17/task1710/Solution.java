package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

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
                    if (args[2].equals("м")) thePerson = Person.createMale(args[1], getDate(args[3]));
                    else if (args[2].equals("ж")) thePerson = Person.createFemale(args[1], getDate(args[3]));

                    allPeople.add(thePerson);

                    System.out.println(allPeople.indexOf(thePerson));
                    break;
                case "-u":
                    thePerson = allPeople.get(Integer.parseInt(args[1]));

                    thePerson.setName(args[2]);
                    thePerson.setBirthDate(getDate(args[4]));
                    if (args[3].equals("м")) thePerson.setSex(Sex.MALE);
                    else if (args[3].equals("ж")) thePerson.setSex(Sex.FEMALE);
                    allPeople.set(Integer.parseInt(args[1]), thePerson);
                    break;
                case "-d":
                    thePerson = allPeople.get(Integer.parseInt(args[1]));

                    thePerson.setName(null);
                    thePerson.setBirthDate(null);
                    thePerson.setSex(null);

                    allPeople.set(Integer.parseInt(args[1]), thePerson);
                    break;
                case "-i":
                    thePerson = allPeople.get(Integer.parseInt(args[1]));
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    System.out.println(thePerson.getName() + " " + (thePerson.getSex() == Sex.MALE? "м":"ж") + " "
                            + dateFormat.format(thePerson.getBirthDate()));
                    break;
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
