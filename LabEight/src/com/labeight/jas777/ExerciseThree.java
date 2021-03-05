package com.labeight.jas777;

public class ExerciseThree {

    public static void main(String[] args) {

        Dogs dogs = new Dogs();
        Cats cats = new Cats();

        try {
            dogs.dogs();
            cats.cats();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
