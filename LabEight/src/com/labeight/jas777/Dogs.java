package com.labeight.jas777;

public class Dogs extends Animals {

    @Override
    public void cats() throws Exception {
        throw new Exception("Incorrect animal!");
    }

    @Override
    public void dogs() throws Exception {
        System.out.println("Dogs bark");
    }

}
