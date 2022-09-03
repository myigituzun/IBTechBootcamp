package com.myigituzun.geometry;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1, 1);
    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = -width;
        } else {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Yükseklik pozitif olmalı: " + height);
        }
        this.height = height;
    }
}

