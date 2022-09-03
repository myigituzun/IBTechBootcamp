package com.myigituzun.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        while (true) {
            try {
                System.out.println("Sürüyor...");
                Thread.sleep(750);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
