package com.myigituzun.thread;

public class MyInnerTest {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                walk();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        process();
    }

    private static void process(){
        while (true) {
            try {
                System.out.println("Sürüyor...");
                Thread.sleep(750);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void walk(){
        while (true) {
            try {
                System.out.println("Koşuyor...");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
