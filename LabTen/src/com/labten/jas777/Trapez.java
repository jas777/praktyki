package com.labten.jas777;

public class Trapez implements Figura {

    // a + b * h /2

    private double a;
    private double b;
    private double h;

    public Trapez(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double obliczPole() {
        return ((a + b) * h) / 2;
    }

    @Override
    public double obliczObwod() {
        return (a * 2) + (b * 2);
    }

}
