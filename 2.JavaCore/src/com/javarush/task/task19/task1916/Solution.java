package com.javarush.task.task19.task1916;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));

        reader.close();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while (file1.ready()) list1.add(file1.readLine());
        while (file2.ready()) list2.add(file2.readLine());

        file1.close();
        file2.close();

        while (!list1.isEmpty() & !list2.isEmpty()){
            if (list2.isEmpty()){
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            }
            else if (list1.isEmpty()){
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list1.remove(0);
                list2.remove(0);
            }
            else if (list1.get(0).equals(list2.get(0))){
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            }
            else if (list2.size() > 1 && list1.get(0).equals(list2.get(1))){
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list1.remove(0);
                list2.remove(0);
            }
            else if (list1.get(0).equals("") & !(list2.get(0).equals(""))){
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list1.remove(0);
                list2.remove(0);
            }
            else if (!(list1.get(0).equals("")) & list2.get(0).equals("")){
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            }

        }

//        //FileWriter fileWriter = new FileWriter("d:\\Development\\Task1916_3.txt");
//        for (LineItem line : lines) {
//         //   fileWriter.write(line.type + line.line);
//            System.out.println(line.type + ":" + line.line);
//        }
//       // fileWriter.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
