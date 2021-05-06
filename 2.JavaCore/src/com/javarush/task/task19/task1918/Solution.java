package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String teg = args[0];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));

        bufferedReader.close();

        String fileText = "";

        while (fileReader.ready()){
            fileText += fileReader.readLine();
        }

        fileReader.close();

        //вариант с регулярным выражением, не выводится часть первой строки
        //нужно править регулярку
//        String patternString =  "<"+teg+"."+"+"+"?"+"/"+teg+">";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(fileText);

//        while (matcher.find()){
//            String result = fileText.substring(matcher.start(), matcher.end());
//            System.out.println(result);
//        }

        //вариант с jsoup, делает то, что надо но валидацию не проходит
        Document document = Jsoup.parse(fileText.toString(), "", Parser.xmlParser());
        Elements elem = document.select(teg);
        for (Element elements : elem){
            System.out.println(elements);
        }

    }
}
