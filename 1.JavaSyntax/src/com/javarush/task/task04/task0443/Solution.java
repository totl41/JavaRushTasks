package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import javax.xml.crypto.Data;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int yyyy = Integer.parseInt(reader.readLine());
        int mm = Integer.parseInt(reader.readLine());
        int dd = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + dd + "." + mm + "." + yyyy);
    }
}
