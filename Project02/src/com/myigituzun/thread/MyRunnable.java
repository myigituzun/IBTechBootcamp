package com.myigituzun.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
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
