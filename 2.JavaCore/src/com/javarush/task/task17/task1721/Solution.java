package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        Thread threadFirst = new Thread(()->{AddDataToList(allLines, firstFileName);});
        Thread threadSecond = new Thread(()->{AddDataToList(forRemoveLines, secondFileName);});

        threadFirst.start();
        threadSecond.start();

        try {
            threadFirst.join();
            threadSecond.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Solution().joinData();

    }

    public static void AddDataToList(List<String> list, String fileName){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

            String line;

            while ((line = reader.readLine()) != null){
                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
