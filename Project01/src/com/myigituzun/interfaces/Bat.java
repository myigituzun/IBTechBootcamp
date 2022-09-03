package com.myigituzun.interfaces;

public class Bat extends Mammal implements Flyable {

    public Bat(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void fly() {
        System.out.println("Yarasa " + name + " uçuyor...");

    }

    @Override
    public void land() {
        System.out.println("Yarasa " + name + " konuyor...");

    }

}
