package com.myigituzun.interfaces;

public abstract class Bird extends Animal implements Flyable {

    public Bird(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        System.out.println("Kuş " + name + " uçuyor...");

    }

    @Override
    public void land() {
        System.out.println("Kuş " + name + " konuyor...");

    }

}
