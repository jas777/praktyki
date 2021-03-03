package com.labsix.jas777;

public class ExerciseOne {

    public static void main(String[] args) {

        Vehicle urbanDriver = new Vehicle(Engine.V4, Color.GREEN, Size.MEDIUM);
        Vehicle sportsCar = new Vehicle(Engine.V12, Color.RED, Size.SMALL);
        Vehicle offRoad = new Vehicle(Engine.V8, Color.BLUE, Size.BIG);

        System.out.println(urbanDriver);
        System.out.println("-".repeat(19));
        System.out.println(sportsCar);
        System.out.println("-".repeat(19));
        System.out.println(offRoad);

    }

}
