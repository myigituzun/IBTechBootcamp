package com.myigituzun.geometry;

public class RectangleTest2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(4);
        rectangle.setHeight(5);

        System.out.println("Alan: " + rectangle.getArea());
        System.out.println("Çevre: " + rectangle.getPerimeter());
    }
}
