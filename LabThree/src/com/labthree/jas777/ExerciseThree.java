package com.labthree.jas777;

public class ExerciseThree {

    public static void main(String[] args) {
        // ...
    }

    public int[] tableSum(int[] tab1, int[] tab2) {

        if (tab1.length != tab2.length)
            return new int[0];

        int[] newTab = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            newTab[i] = tab1[i] + tab2[i];
        }

        return newTab;

    }

}
