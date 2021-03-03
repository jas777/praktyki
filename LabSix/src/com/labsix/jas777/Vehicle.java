package com.labsix.jas777;

public class Vehicle {

    private final Engine engine;
    private final Color color;
    private final Size size;

    public Vehicle(Engine engine, Color color, Size size) {
        this.engine = engine;
        this.color = color;
        this.size = size;
    }

    public Engine getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb
                .append("Engine : ")
                .append(engine.getName())
                .append("\n")
                .append("Color  : ")
                .append(color.getName())
                .append("\n")
                .append("Size   : ")
                .append(size.getName());

        return sb.toString();

    }
}
