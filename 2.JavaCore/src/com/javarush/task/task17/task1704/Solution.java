package com.javarush.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки 2
*/

public class Solution {

    public static void main(String[] args) {
//        Note note = new Note();
//        Note note2 = new Note();
//        note.addNote(0,"test");
//        note2.addNote(0,"test2");
//
//        System.out.println(note.notes.get(0));
//        System.out.println(note2.notes.get(0));
    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}
