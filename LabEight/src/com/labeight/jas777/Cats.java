package com.labeight.jas777;

public class Cats extends Animals {

    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() throws Exception {
        throw new Exception("Incorrect animal!");
    }

}
