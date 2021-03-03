package com.labseven.jas777;

public enum Size {

    SMALL("Small"),
    MEDIUM("Medium"),
    BIG("Big"),
    HUGE("Huge");

    private final String name;

    Size(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
