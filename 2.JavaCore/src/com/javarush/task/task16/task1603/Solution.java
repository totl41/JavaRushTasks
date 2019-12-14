package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread specialThread_1 = new SpecialThread();
        SpecialThread specialThread_2 = new SpecialThread();
        SpecialThread specialThread_3 = new SpecialThread();
        SpecialThread specialThread_4 = new SpecialThread();
        SpecialThread specialThread_5 = new SpecialThread();

        Thread thread_1 = new Thread(specialThread_1);
        Thread thread_2 = new Thread(specialThread_2);
        Thread thread_3 = new Thread(specialThread_3);
        Thread thread_4 = new Thread(specialThread_4);
        Thread thread_5 = new Thread(specialThread_5);

        list.add(thread_1);
        list.add(thread_2);
        list.add(thread_3);
        list.add(thread_4);
        list.add(thread_5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
