package com.myigituzun.project01.hw02;

public class QuadraticPolynomial implements MathFunction {
    private double a;
    private double b;
    private double c;

    public QuadraticPolynomial(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticPolynomial() {
        this(1, 1, 0);
    }

    @Override
    public double evaluate(double x) {
        return (a * x * x) + (b * x) + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}
