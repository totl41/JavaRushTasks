package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> namesFile = new ArrayList<>();

        String fileName = "";
        boolean notExit = true;

        while (!(fileName = reader.readLine()).equals("exit")){
            namesFile.add(fileName);
        }
        reader.close();

        for (String name : namesFile){
            ReadThread readThread = new ReadThread(name);
            readThread.run();
        }

//        for (Map.Entry<String, Integer> entry : resultMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName)  {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run(){
            HashMap<Integer, Integer> mapByte = new HashMap<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                int byteS = 0;
                while((byteS = reader.read()) != -1){
                    if (!mapByte.containsKey(byteS)){
                        mapByte.put(byteS, 1);
                    }
                    else {
                        mapByte.merge(byteS, 1, Integer::sum);
                    }
                }
                reader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int key = mapByte.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).iterator().next().getKey();

            synchronized (resultMap){
                resultMap.put(fileName, key);
            }
        }
    }
}
