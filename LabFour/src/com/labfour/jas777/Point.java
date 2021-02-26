package com.labfour.jas777;

public class Point {

    private final int x;
    private final int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point anotherPoint) {

        double a = this.x - anotherPoint.getX();
        double b = this.y - anotherPoint.getY();

        return Math.sqrt(a + b);

    }

    public double calculateDistance(int x2, int y2) {

        double a = this.x - x2;
        double b = this.y - y2;

        return Math.sqrt(a + b);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
