package com.labten.jas777;

public class Kwadrat implements Figura{

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }

    @Override
    public double obliczObwod() {
        return bok * 4;
    }

}
