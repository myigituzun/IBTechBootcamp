package com.myigituzun.project01.hw02;

public class Test {
    public static void main(String[] args) {
        IdentityFunction f1 = new IdentityFunction();
        QuadraticPolynomial f2 = new QuadraticPolynomial();
        SinusoidalPolynomial f3 = new SinusoidalPolynomial(1, 2, 3);
        FunctionDrawer drawer = new FunctionDrawer();

        drawer.draw(f1, 10, 15, 100);
        System.out.println("\n--------------------------------------------------------------------------\n");
        drawer.draw(f2, -5, 5, 100);
        System.out.println("\n--------------------------------------------------------------------------\n");
        drawer.draw(f3, -Math.PI, Math.PI, 100);
    }
}
