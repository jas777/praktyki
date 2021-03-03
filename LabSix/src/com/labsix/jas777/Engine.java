package com.labsix.jas777;

public enum Engine {

    V2("V2"),
    V4("V4"),
    V6("V6"),
    V8("V8"),
    V12("V12");

    private final String name;

    Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
