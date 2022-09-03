package com.myigituzun.collections;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = new int[4];

        array[0] = 3;
        array[1] = -7;
        array[2] = 11;
        array[3] = 6;

        int product = 1;
        for (int element : array) {
            product *= element;
        }
        System.out.println("Çarpım: " + product);
    }
}
