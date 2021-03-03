package com.labseven.jas777;

public class ExerciseOne {

    public static void main(String[] args) {

        Dog dog = new Dog("Burek", Color.GREEN);
        Cat cat = new Cat("Garfield", Color.RED);

        System.out.println(dog.makeSound());
        System.out.println();
        System.out.println(cat.makeSound());

    }

}
