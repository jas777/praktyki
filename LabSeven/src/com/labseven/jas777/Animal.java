package com.labseven.jas777;

public class Animal {

    protected final String name;
    protected final String sound;

    protected final Color color;

    public Animal(String name, String sound, Color color) {
        this.name = name;
        this.sound = sound;
        this.color = color;
    }

    public String makeSound() {

        StringBuilder sb = new StringBuilder();

        sb
                .append("Name  : ")
                .append(name)
                .append("\n")
                .append("Sound : ")
                .append(sound)
                .append("\n")
                .append("Color : ")
                .append(color.getName());

        return sb.toString();

    }



}
