package com.myigituzun.interfaces;

public class Test {
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon("Paçalı");
        pigeon.fly();
        pigeon.land();

        Bird bird = new Pigeon("Taklacı");
        bird.fly();
        bird.land();

        Flyable flyable = new Pigeon("Postacı");
        flyable.fly();
        flyable.land();

        Bat bat = new Bat("Batman");
        bat.fly();
        bat.land();

        Mammal mammal = new Bat("Robin");
        // mammal.fly();
        // mammal.land();
        System.out.println(mammal.getName() + " Uçamaz");

        Flyable flyable2 = new Bat("Vampir");
        flyable2.fly();
        flyable2.land();

        makeFly(pigeon);
        makeFly(bird);
        makeFly(flyable);
        makeFly(bat);
        // makeFly(mammal);
        makeFly(flyable2);
    }

    private static void makeFly(Flyable flyable) {
        System.out.println("\nUÇ!");
        flyable.fly();
        System.out.println("KON!");
        flyable.land();
    }
}
