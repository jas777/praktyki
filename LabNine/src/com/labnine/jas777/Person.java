package com.labnine.jas777;

public class Person {

    private final String firstName;
    private final String lastName;

    private final int birthYear;

    public Person(String firstName, String lastName, int birthYear) throws Exception {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

        checkPersonalInformation(firstName, lastName, birthYear);

    }

    private void checkPersonalInformation(String firstName, String lastName, int birthYear) throws Exception {

        if (firstName.isBlank())
            throw new Exception("Podano niewłaściwe imię!");

        if (lastName.isBlank())
            throw new Exception("Podano niewłaściwe nazwisko!");

        if (birthYear < 1900 || birthYear > 2020)
            throw new Exception("Podano niewłaściwy rok urodzenia!");

    }

    @Override
    public String toString() {
        return "Person\n" +
               "First name : " + firstName + '\n' +
               "Last name  : " + lastName + '\n' +
               "Birth year : " + birthYear;
    }
}
