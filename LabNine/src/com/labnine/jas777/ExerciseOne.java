package com.labnine.jas777;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Podaj imię: ");
            String firstName = scanner.nextLine();

            System.out.println("Podaj nazwisko: ");
            String lastName = scanner.nextLine();

            System.out.println("Podaj rok urodzenia: ");
            int birthYear = scanner.nextInt();

            Person person = new Person(firstName, lastName, birthYear);

            System.out.println(person);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            main(new String[0]);
        }

    }

}
