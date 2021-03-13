package com.labten.jas777;

public class Prostokat implements Figura{

    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwod() {
        return (a * 2) + (b * 2);
    }

}
