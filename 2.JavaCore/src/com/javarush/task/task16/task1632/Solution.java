package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new ThreadOne()));
        threads.add(new Thread(new ThreadTwo()));
        threads.add(new Thread(new ThreadThree()));
        threads.add(new ThreadFour());
        threads.add(new Thread(new ThreadFive()));
    }

    public static void main(String[] args) {

    }

    public static class ThreadOne implements Runnable {

        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadTwo implements Runnable{

        @Override
        public void run() {
            try{
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class ThreadThree implements Runnable {

        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreadFour extends Thread implements Message{
        boolean repeat = true;

        @Override
        public void showWarning() {
            repeat = false;
        }

        @Override
        public void run() {
            while (repeat);
        }
    }

    public static class ThreadFive implements Runnable{

        @Override
        public void run() {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int total = 0;
            String xS = null;

            while (true) {
                 try {
                        xS = reader.readLine();
                        if (xS.equals("N")) {
                            break;
                        }
                        total = total + Integer.parseInt(xS);
                 }
                 catch (IOException e) {
                 }
            }
            System.out.println(total);
        }
    }
}