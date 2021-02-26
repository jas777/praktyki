package com.labfour.jas777;

public class Square {

    private final int bok;

    public Square(int bok) {
        this.bok = bok;
    }

    public int area() {
        return (int) Math.pow(bok, 2);
    }

    public int circuit() {
        return bok * 4;
    }

}
