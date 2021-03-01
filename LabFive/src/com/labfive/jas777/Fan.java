package com.labfive.jas777;

import java.awt.*;

// Exercise 2

public class Fan {

//    public static void main(String[] args) {
//        System.out.println(new Fan().information());
//    }

    private final int SLOW   = 1;
    private final int MEDIUM = 2;
    private final int FAST   = 3;

    private double speed;
    private double radius;

    private boolean on;

    private Color color;

    public Fan() {

        this.speed  = SLOW;
        this.radius = 5;

        this.on = false;

        this.color = Color.RED;

    }

    public Fan(double speed, double radius, boolean on, Color color) {
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color = color;
    }

    public String information() {
        return String.format("---------- Stan wiatraka ----------\n" +
                             "Prędkość : %s\n" +
                             "Promień  : %s\n" +
                             "Kolor    : %s\n" +
                             "ON / OFF : %s\n", speed, radius, color.toString(), on ? "ON" : "OFF");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
